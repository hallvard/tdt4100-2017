package arv;

import java.util.Arrays;
import java.util.List;

public class Ordbok extends Bok {

	private int antallOrd;
	private List<String> ulovligeTitler = Arrays.asList("en", "to", "tre");
	
	public Ordbok(String tittel, int antallOrd) {
		super(tittel);
		this.antallOrd = antallOrd;
	}
	public Ordbok(String tittel) {
		super(tittel);
	}
	
	@Override
	public String toString() {
		return "[Ordbok tittel=" + getTittel() + ", antallOrd=" + antallOrd + "]";
	}
	
	@Override
	public boolean isValidTitle(String s) {
		return super.isValidTitle(s) && (! ulovligeTitler.contains(s));
	}
	
	@Override
	public void setTittel(String tittel) {
		if (! tittel.endsWith(" ordbok")) {
			tittel = tittel + " ordbok";
		}
		super.setTittel(tittel);
	}
	
	public int getAntallOrd() {
		return antallOrd;
	}
	
	public void setAntallOrd(int antallOrd) {
		this.antallOrd = antallOrd;
	}
	
	public void overload(Bok bok) {
		System.out.println(bok);
	}
	public void overload(Ordbok bok) {
		System.out.println(bok);
	}
}
