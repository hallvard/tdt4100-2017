package mappeeksempel;

import java.util.ArrayList;
import java.util.List;

public class Folder {

	private Folder parentFolder;
	private List<Folder> subFolders = new ArrayList<>();
	private List<File> files = new ArrayList<>();

	private String name;

	public Folder(String name, Folder parentFolder) {
		this.name = name;
		this.parentFolder = parentFolder;
		if (parentFolder != null) {
			parentFolder.subFolders.add(this);
		}
	}
	
	void addFile(File file) {
		this.files.add(file);
	}
	
	public static void main(String[] args) {
		Folder root = new Folder("", null);
		File rootFile = new File("README.txt", root);
		Folder folder1 = new Folder("Users", root);
		Folder home1 = new Folder("hal", root);
		File myProfileFile = new File("profile.png", home1);		
	}
}
