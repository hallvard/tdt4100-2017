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
	
	@Override
	public String toString() {
		return name;
	}

}
