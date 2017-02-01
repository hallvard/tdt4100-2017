package of4;

/**
 * Gjennomgått i øvingsforelesning 01.02.2017.
 *
 */

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > ");
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			String line = scanner.next(); // Henter ut neste linje basert på linjeskift
			System.out.println("Scanner-objektet fant: " + line);
			if (line.equals("lukk")) {
				break;
			}
			System.out.print(" > ");
		}
		
		scanner.close();
	}
	
}
