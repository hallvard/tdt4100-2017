package of4;

/**
 * Gjennomgått i øvingsforelesning 01.02.2017.
 *
 */

import java.util.Arrays;

public class Journal {

	private String name;
	// Opprettes når en Journal instansieres
	private Article[] articles = new Article[2];
	
	public Journal(String name) {
		this.name = name;
	}
	
	public void addArticle(Article article, int i) {
		if (i < 0 || i >= articles.length) {
			throw new IllegalArgumentException("Kan ikke legge til.");
		}
		// Trenger ikke else her
		articles[i] = article;
		article.setJournal(this);
	}
	
	public Article[] getArticles() {
		return this.articles;
	}


	public String toString() {
		return "Journalen heter " + name + ", og består av " +
				Arrays.toString(articles) + ".";
	}

	public static void main(String[] args) {
		Journal j = new Journal("Java Daily");
		Article a = new Article("Exercise-tillegget", "H.T.");
		Article a2 = new Article("Gunnar B.");
		System.out.println(a2.getJournal());
		
		j.addArticle(a, 0);
		j.addArticle(a2, 1);
		System.out.println(a2.getJournal()); // a2.getJournal() == j
		//j.addArticle(a2, 2);
		System.out.println(j);
	}
	
	
}
