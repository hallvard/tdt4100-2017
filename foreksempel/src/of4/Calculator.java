package of4;

/**
 * Ikke gjennomgått i øvingsforelesning 01.02.2017,
 * men nyttig å lese gjennom før man begynner på RPN-
 * kalkulatoren («vanskelig») i øving 3.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	
	List<String> calculationHistory;
	Scanner scanner;
	
	public Calculator() {
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\n"); // Merk: Må settes!
		
		// Hvorfor er det greit med ArrayList, og ikke List?
		// Hvorfor er det greit ikke å ha typeparameter (dvs. tom <>)?
		calculationHistory = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String input;
		String[] inputArray;
		double input1, input2, result;
		char operator;
		
		// Kalkulasjonsløkke
		do {
			System.out.print("Skriv inn operasjon:\n> ");
			input = calc.scanner.next();
			if (input.toLowerCase().equals("stopp")) {
				break;
			}
			inputArray = input.split(" ");
			// System.out.println("Input er " + Arrays.toString(input)); // Statisk toString-metode
			
			// Beregne
			input1 = Double.parseDouble(inputArray[0]);
			input2 = Double.parseDouble(inputArray[2]);
			operator = inputArray[1].charAt(0);
			result = calc.performOperation(input1, input2, operator);
			
			// Lagre resultatet
			calc.calculationHistory.add("Resultatet av " + input1 + " " + operator + " " + input2 + " er " + result);
		} while (true);
		
		calc.scanner.close();
		
		// Skriv ut historikken
		System.out.println("\n### Historikk ###");
		for (int i = 0; i < calc.calculationHistory.size(); i++) {
			System.out.println(calc.calculationHistory.get(i));
		}
	}

	private double performOperation(double input1, double input2, char operator) {
		double result = 0; // Ikke initialisér først, se error ved return-deklarasjonen.
		switch(operator) {
		case '+': {
			result =  input1 + input2;
			break;
		} case '-': {
			result = input1 - input2;
			break;
		} case '*': {
			result = input1 * input2;
			break;
		} case '/': {
			result = input1 / input2;
			break;
		} case '%': {
			result = input1 % input2;
			break;
		} case 'e': {
			result = Math.pow(input1, input2);
			break;
		}
		}
		return result; 
	}
    
}
 
