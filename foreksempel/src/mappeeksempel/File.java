package mappeeksempel;

public class File {

	private Folder parentFolder;
	
	private String name;

	public File(String name, Folder parentFolder) {
		this.name = name;
		if (parentFolder == null) {
			throw new IllegalArgumentException("A file must be in a folder");
		}
		this.parentFolder = parentFolder;		
		parentFolder.addFile(this);
	}

	public Folder getParentFolder() {
		return parentFolder;
	}
	
	// flytter denne mappa over i targetFolder
	public void move(Folder targetFolder) {
	}

	// denne skal utvides til å vise hele stien fra rot-noden og ned
	@Override
	public String toString() {
		return parentFolder.toString() + name;
	}

}
