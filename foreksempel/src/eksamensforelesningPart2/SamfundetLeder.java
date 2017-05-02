package eksamensforelesningPart2;

import java.util.Arrays;
import java.util.List;

public class SamfundetLeder {

	List<SamfundetArbeider> arbeidere;
	private int nesteArbeider = 0;
	
	public SamfundetLeder(){
		SamfundetArbeider samf1 = new SamfundetArbeider(56, "Hallvard", "234-12341324-1234");
		SamfundetArbeider samf2 = new SamfundetArbeider(23, "Marit", "824-12341324-1234");
		SamfundetArbeider samf3 = new SamfundetArbeider(67, "Jens", "2234-12341324-1234");
		arbeidere = Arrays.asList(samf1, samf2, samf3);
	}
	
	public void skrivMotereferat(){
		arbeidere.get(nesteArbeider).skriveMotereferat();
		nesteArbeider = (nesteArbeider + 1) % 3;
	}
	
	public static void main(String[] args) {
		SamfundetLeder gabriel = new SamfundetLeder();
		for(int i = 0; i < 30; i++) {
			gabriel.skrivMotereferat();
		}
	}
}
