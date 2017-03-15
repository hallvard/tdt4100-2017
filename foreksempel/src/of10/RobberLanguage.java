package of10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RobberLanguage {

	private static final String CONSONANTS = "BCDFGHJKLMNPQRSTVWXZ";
	private static final String ILLEGAL_CHARS = "#$%@*";
	
	public String encryptInRobberLanguage(String inString) {
		String outStr = "";
		for (int i = 0; i < inString.length(); i++) {
			char ch = inString.charAt(i);
			if (CONSONANTS.indexOf(Character.toUpperCase(ch)) >= 0) { // Konsonant
				outStr += ch + "o" + Character.toLowerCase(ch);
			} else if (ILLEGAL_CHARS.indexOf(ch) >= 0) {
				// Merk: RLPE er unchecked (fordi den er en IllArgEx)
				throw new RobberLanguageParseException("Invalid char", ch);
			} else { // Ikke konsonant (f.eks. vokal, !, ?, etc.)
				outStr += ch;
			}
		}
		return outStr;		
	}
	
	public String decryptInRobberLanguage(String inString) {
		String outStr = "";
		int i = 0;
		while (i < inString.length()) {
			char ch = inString.charAt(i);
			if (CONSONANTS.indexOf(Character.toUpperCase(ch)) >= 0) {
				i += 2; // Hopper over 'o' og samme tegn på nytt
			}
			outStr += ch;
			i++;
		}
		return outStr;
	}
	
	public static void main(String[] args) throws IOException {
		RobberLanguage rl = new RobberLanguage();
		String illegalString = "Ja@a";
		String s = rl.encryptInRobberLanguage(illegalString);
		
		
		String roverspraak = rl.encryptInRobberLanguage("Hei!");
		System.out.println(roverspraak);
		
		// Lese "diktet", oversette til roverspråk, skrive til fil
		String rootAddress = new File("").getAbsolutePath();
		String inFileAddress = rootAddress + "/src/of10/file.txt";
		String inString = FileManager.readStringLines(inFileAddress); // Les diktet
		String encryptedString = rl.encryptInRobberLanguage(inString);
		String outFileAddress = rootAddress + "/src/of10/roverspraak.txt";
		FileManager.writeString(encryptedString, outFileAddress);
		
		// Dekryptere verset
		String decryptedString = rl.decryptInRobberLanguage(encryptedString);
		System.out.println(encryptedString);
		System.out.println("\n\n");
		System.out.println(decryptedString);
	}
	
}
