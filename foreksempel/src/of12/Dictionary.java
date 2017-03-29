package of12;

public class Dictionary extends Book {

	private int numberOfWords;
	
	public Dictionary(String title,
			int numberOfWords) {
		super(title);
		this.numberOfWords = numberOfWords;
	}
	
	@Override
	public void setTitle(String title) {
		if (!title.endsWith("ordbok")) {
			title += "-ordbok";
		}
		this.title = title;
	}
	
	public int getNumberOfWords() {
		return numberOfWords;
	}
	
	public static void main(String[] args) {
		Book dict = new Dictionary("Ivar Aasen special", 400);
		System.out.println(dict);
	}
	
}
