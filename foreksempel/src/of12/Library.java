package of12;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		if (!books.contains(book)) {
			books.add(book);
		}
	}
	
	public void removeBook(Book book) {
		if (books.contains(book)) {
			books.remove(book);
		}
	}
	
	public int getNumberOfComicBooks() {
		int numberOfComicBooks = 0;
		for (Book book : books) {
			if (book instanceof ComicBook) {
				numberOfComicBooks++;
			}
		}
		return numberOfComicBooks;
	}
	
	public static void main(String[] args) {
		Library library = new Library();
		library.addBook(new Dictionary("Norsk ordliste",
				100));
		library.addBook(new ComicBook("Pondus",
							400));
		library.addBook(new ComicBook("Donald (Duck)",
				400));
		library.addBook(new Dictionary("Norsk-Swahili",
				400000));
		System.out.println("Biblioteket inneholder "+
				library.getNumberOfComicBooks() +
				" tegneserier.");
	}
	
}
