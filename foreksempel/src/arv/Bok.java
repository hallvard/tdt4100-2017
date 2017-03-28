package arv;

public class Bok {

	private String tittel;
	
	public Bok(String tittel) {
		setTittel(tittel);
	}
	
	@Override
	public String toString() {
		return "[Bok tittel=" + tittel + "]";
	}
	
	public String getTittel() {
		return tittel;
	}
	
	private String ulovligeBokstaver = "#$%&/(";
	
	public boolean isValidTitle(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (ulovligeBokstaver.indexOf(c) >= 0) {
				return false;
			}
		}
		return true;
	}
	
	public void setTittel(String tittel) {
		if (! isValidTitle(tittel)) {
			throw new IllegalArgumentException("Ulovlig tegn i " + tittel);
		}
		this.tittel = tittel;
	}
}
