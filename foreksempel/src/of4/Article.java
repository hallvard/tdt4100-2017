package of4;

/**
 * Gjennomgått i øvingsforelesning 01.02.2017.
 *
 */

public class Article {

	private String name, author;
	private Journal journal;
	
	public Article(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public Article(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		return "Artikkelen " + name + " er skrevet av " + author;
	}
	
	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	
	public static void main(String[] args) {
		Article a = new Article("Exercise-tillegget", "H. Trætteberg");
		// System.out.println(a);
		Article a2 = new Article("H. Trætteberg");
		System.out.println(a2);
		System.out.println("Journalen til artikkel 2 er " + a2.journal);
	}

	public Journal getJournal() {
		return journal;
	}
	
}
