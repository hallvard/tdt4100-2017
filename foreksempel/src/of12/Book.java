package of12;

public abstract class Book {

	protected String title; // Protected for synlighet innad i samme package
	
	public Book(String title) {
		setTitle(title);
	}
	
	public abstract void setTitle(String title);
	
	public String getTitle() {
		return title;
	}
	
	public void printBookType() {
		System.out.println("Dette er en bok");
	}
	
	@Override // Arv forekommer allerede her!
	public String toString() {
		return "Boken heter " + title;
	}
	
	public static void main(String[] args) {
		Book book = new Dictionary("Nynorsk ordbok",
				50000);
		System.out.println(book);
		book.printBookType();
	}
	
}
