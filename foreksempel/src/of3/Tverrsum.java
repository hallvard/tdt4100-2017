package of3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tverrsum {
	
	// Program som tar inn et heltall og beregner tverssummen av det
	// Beholder også alle tverrsummer
	
	int input, result;
	ArrayList<String> list;
	
	public Tverrsum() {
		list = new ArrayList<>();
	}

	private void updateHistory(int input, int result) {
		list.add("Tverrsummen av tallet " + input + ":\t" + result);
	}
	
	private void calculate(String inputStr) { 
		int result = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			result += Character.getNumericValue(ch); 
		}
		int input = Integer.parseInt(inputStr);
		this.updateHistory(input, result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tverrsum tverrsum = new Tverrsum();
		// Do-while er siste viktige løkkekonstruksjon (omskriving av while-løkke)
		do {
			// Les inn fra brukeren
			System.out.print("Skriv inn et heltall: ");
			String token = scanner.next();
			// Beregner tverrsummen og oppdaterer historikken
			tverrsum.calculate(token);
			// Skriv tilbake			
		} while (tverrsum.list.size() < 5);
		scanner.close();
		
		System.out.println("\n\n### Ferdig med beregning av tverrsummer. ###\n\n" +
				"Historikk:");
		
		for (int i = 0; i < tverrsum.list.size(); i++) {
			System.out.println(tverrsum.list.get(i));
		}
	}
	
}
