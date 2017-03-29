package of12;

public class ComicBook extends Book {

	private int numberOfComicStrips;
	private String illegalCharacters = "@#$%";
	
	public ComicBook(String title,
			int numberOfStrips) {
		// Superklassen (Book) sin konstruktør
		// Superkonstruktør må kalles først
		super(title);
		this.numberOfComicStrips = numberOfStrips;
	}
	
	@Override
	public void setTitle(String title) {
		this.title = title + "-tegneserie";
	}
	
	@Override
	public String toString() {
		return "Tegneseriealbum ved navn: " + title;
	}
	
	public int getNumberOfComicStrips() {
		return numberOfComicStrips;
	}
	
	public static void main(String[] args) {
		Book cb = new ComicBook("Pondus", 400);
		// Dynamisk metodebinding
		// (Dyn. method lookup)
		System.out.println(cb);
		// OBS! DML fungerer ikke på st. metoder
		cb.printBookType(); 
	}
	
	
	public void printBookType() {
		System.out.println("Dette er en tegneserie.");
	}

	
	
}
