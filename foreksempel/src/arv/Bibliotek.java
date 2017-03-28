package arv;

public class Bibliotek {

	public static void main(String[] args) {
		Bok bok = new Bok("Sofies verden");
		// hvorfor kræsjer isValidTitle-metoden?
		Ordbok ordbok = new Ordbok("Nynorsk ordbok", 57817);
		// hvilken overload-metode blir kalt?
		ordbok.overload((Bok) ordbok);
		
		Bok album = new Tegneseriealbum("Flat firer");
		((Tegneseriealbum) album).setAntallStriper(128);
		
		System.out.println(bok);
		System.out.println(ordbok);
		System.out.println(album);
	}

}
