package eksamensforelesningPart2;

public class CheckedUnckecked {

	String string;
	
	public void setString(){
		string = "hei";
	}
	
	public static void main(String[] args) {
		CheckedUnckecked program = new CheckedUnckecked();
		try {

			program.string.chars();
		} catch (NullPointerException e) {
			System.out.println("Det gikk bra likevel");
		} finally {
			System.out.println("Programmet er ferdig.");
		}
	}
}
