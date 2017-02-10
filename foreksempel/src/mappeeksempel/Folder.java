package mappeeksempel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Folder {

	// referanse til mappa som denne mappa ligger i
	private Folder parentFolder;
	// liste over alle mappene inni denne
	private List<Folder> subFolders = new ArrayList<>();
	// liste over alle filene inni denne mappa
	private List<File> files = new ArrayList<>();

	private String name;

	public Folder(String name, Folder parentFolder) {
		this.name = name;
		this.parentFolder = parentFolder;
		if (parentFolder != null) {
			parentFolder.subFolders.add(this);
		}
	}
	
	@Override
	public String toString() {
		// rot-mappa skal alltid vises som "/"
		if (parentFolder == null) {
			return "/";
		}
		return parentFolder.toString() + name + "/";
	}

	// denne brukes av File, for å legge seg til parent-mappa
	// ingen synlighetsmodifikator betyr pakke-synlighet
	void addFile(File file) {
		this.files.add(file);
	}
	// denne brukes av File, for å fjerne seg fra parent-mappa
	// ingen synlighetsmodifikator betyr pakke-synlighet
	void removeFile(File file) {
		this.files.remove(file);
	}

	// sjekker om fileOrFolder ligger inni denne mappa
	public boolean contains(Object fileOrFolder) {
		// Vi ønsker å la currentFolder gå fra argumentet og oppover i hierarkiet og se om vi treffer på this (inn while-løkka under).
		// I så fall er fileOrFolder inni this. Hvis currentFolder blir null, så er this ikke funnet og vi returnerer false.
		Folder currentFolder = null;
		// Vi vet ikke hva fileOrFolder er, må sjekke de relevante tilfellene
		// Sjekker om fileOrFolder faktisk er en Folder
		if (fileOrFolder instanceof Folder) {
			// currentFolder skal starte på denne mappa
			currentFolder = ((Folder) fileOrFolder); // sier at fileOrFolder faktisk er en Folder 
		// Sjekker om fileOrFolder faktisk er en File
		} else if (fileOrFolder instanceof File) {
			// currentFolder skal starte på denne filen sin mappa
			currentFolder = ((File) fileOrFolder).getParentFolder(); // sier at fileOrFolder faktisk er en File og returner denne sin parentFolder			
		} // hvis fileOrFolder er verken en Folder eller File, så forblir currentFolder == null
		// la currentFolder flytte seg oppover, inntil den er passert rot-mappa
		while (currentFolder != null) {
			// har vi funnet this?
			if (currentFolder == this) {
				return true;
			}
			// flytt currentFolder ett hakk opp
			currentFolder = currentFolder.parentFolder;
		}
		return false;
	}
	
	// flytter denne mappa over i targetFolder
	public void move(Folder targetFolder) {
		if (targetFolder != null && this.contains(targetFolder)) {
			throw new IllegalArgumentException("Trying to make circular structure, by putting " + this + " inside " + targetFolder);
		}
		if (parentFolder != null) {
			parentFolder.subFolders.remove(this);
		}
		if (targetFolder != null) {
			targetFolder.subFolders.add(this);
		}
		parentFolder = targetFolder;
	}
	
	// returnerer første fil med angitt navn eller endelse
	public File findFirst(String base, String ext) {
		// sjekker først om denne mappa selv inneholder en fil med matchende navn
		for (File file : files) {
			if (matchName(file.getName(), base, ext)) {
				return file;
			}
		}
		// sjekker så om en undermappe inneholder en fil med matchende navn
		for (Folder folder : subFolders) {
			File found = folder.findFirst(base, ext);
			// hvis undermappa har en matchende fil, så returneres denne
			// (uten å prøve de resterende mappene
			if (found != null) {
				return found;
			}
		}
		// ingen File ble funnet, verken i denne mappa eller i en undermappe
		return null;
	}

	// hjelpemetode som matcher name mot base (det før .) og ext (det etter .)
	// oppgave: hva skjer hvis name ikke har noen .
	private static boolean matchName(String name, String base, String ext) {
		// finner posisjonen til siste . i navnet
		int pos = name.lastIndexOf('.');
		// lager en ny String med bokstavene som ligger foran .
		String nameBase = name.substring(0, pos);
		// lager en ny String med bokstavene som ligger bak .
		String nameExt = name.substring(pos + 1);
		// hver kriterium er sant, hvis det er null (slags wildcard) eller stemmer med name
		return (base == null || nameBase.equals(base)) &&
			    (ext == null || nameExt.equals(ext));
	}

	// returnerer alle filene med angitt navn eller endelse
	public Collection<File> findAll(String base, String ext) {
		Collection<File> foundFiles = new ArrayList<>();
		findAll(base, ext, foundFiles);
		return foundFiles;
	}

	// samler alle filene med angitt navn eller endelse i matchingFiles
	// oppgave: hvorfor kan ikke denne hjelpemetoden være static
	private void findAll(String base, String ext, Collection<File> matchingFiles) {
		// sjekker først filene inni denne mappa
		for (File file : files) {
			if (matchName(file.getName(), base, ext)) {
				matchingFiles.add(file);
			}
		}
		// ber så undermappene om å legge til filene lengre ned
		for (Folder folder : subFolders) {
			folder.findAll(base, ext, matchingFiles);
		}
		// ingen File ble funnet, verken i denne mappa eller i en undermappe
	}
	
	public static void main(String[] args) {
		Folder root = new Folder("", null);
		File rootFile = new File("README.txt", root);
		Folder tmp = new Folder("tmp", root);
		Folder folder1 = new Folder("Users", root);
		Folder home1 = new Folder("hal", folder1);
		File myReadme = new File("README.txt", home1);
		File myProfileFile = new File("profile.png", home1);	
		
		System.out.println("Skulle være /, var " + root.toString());
		System.out.println("Skulle være /README.TXT, var " + rootFile.toString());
		System.out.println("Skulle være /Users/, var " + folder1.toString());
		System.out.println("Skulle være /Users/hal/, var " + home1.toString());
		System.out.println("Skulle være /Users/hal/profile.png, var " + myProfileFile.toString());

		System.out.println("Skulle være true, var " + root.contains(folder1));
		System.out.println("Skulle være true, var " + root.contains(rootFile));
		System.out.println("Skulle være true, var " + root.contains(home1));

		System.out.println("Skulle være false, var " + tmp.contains(folder1));
		System.out.println("Skulle være false, var " + tmp.contains(rootFile));
		System.out.println("Skulle være false, var " + tmp.contains(home1));
		
		folder1.move(tmp);
		System.out.println("Skulle være /tmp/Users/, var " + folder1.toString());
		myProfileFile.move(tmp);

		// skal gi IllegalArgumentException:
		// tmp.move(folder1);

		System.out.println("Skulle være /tmp/profile.png, var " + root.findFirst(null,  "png"));
		System.out.println("Skulle være null, var " + root.findFirst(null,  "ping"));

		System.out.println("Skulle være [/tmp/profile.png], var " + root.findAll(null,  "png"));
		System.out.println("Skulle være\n[/README.txt, /tmp/Users/hal/README.txt], var\n" + root.findAll("README", null));
	}
}
