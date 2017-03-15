package of10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileManager {

	/*
	 * Lesing/skriving av String-objektdatatypen.
	 * Demonstreres i ØF10.
	 */
	public static String readStringLines(String address) {
		String outStr = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(address)); //BufferedReader-konstruktøren kan også gå rett på addresse.
			while (br.ready()) {
				outStr += br.readLine();
				outStr += "\n"; // Legge til ny linje, da BufferedReader evt. fjerner denne
			}
		} catch(FileNotFoundException fnfe) {
			System.err.println("Feil, fant ikke filen!");
			fnfe.printStackTrace();
		}
		catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Enda (?) en feil!");
		} finally {
			try {
				// public void close() throws IOException
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return outStr;
	}
	
	public static void writeString(String outString, String address)
			throws IOException {
		PrintWriter writer = new PrintWriter(address);
		writer.println(outString);
		// Tøm bufferet
		writer.flush();
		writer.close();
	}
	
	/*
	 * Kjapp repetisjon av Scanner-klassen
	 */
	public static String readStringWords(String address) throws FileNotFoundException {
		String outStr = "";
		Scanner in = new Scanner(new FileReader(address));
		in.useDelimiter(" ");
		// Standard skilletegn er ' '
		while (in.hasNext()) {
			outStr += in.next();
		}
		in.close();
		return outStr;
	}
	
	/*
	 * Bruk av Java 8-streams
	 */
	public static void lambdaReadLines(String address) {
		Path path = Paths.get(address);
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(s -> System.out.println(s));
        } catch (IOException ex) {
        	// Gotta catch'em all.
        }
	}

	
	/*
	 * Lesing/skriving av char-datatypen.
	 * Demonstrert i ØF9.
	 */
	
	public static char[] readChars(String address) {
		Reader reader = null; // Leser chars
		char[] buffer = null;
		try {
			reader = new FileReader(new File(address));
			buffer = new char[1000]; //En char[] over alle karakterene i filen (str. 1000!)
			int charCount = reader.read(buffer);
			System.out.println("Leste " + charCount + " bokstaver.");
		} catch (FileNotFoundException e1) { // FNFE arver fra IO
			System.err.println("Fant ikke filen...");
		} catch (IOException e2) {
			System.err.println("Det er skjedde ved lesing fra fil.");
		} finally {
			try {
				reader.close();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
		}
		return buffer;
	}
	
	public static void writeChars(char[] content, String address) throws IOException {
		FileWriter writer = new FileWriter(new File(address));
		writer.write(content);
		writer.flush(); // Forsikre oss om at all data i bufferet content (dvs. i minnet)
		// skrives til fil
		writer.close();
	}

	
	public static void main(String[] args) throws IOException {
		String address = new File("").getAbsolutePath() + "/src/of10_lf/file.txt";
		String poem = readStringLines(address);
		//System.out.println(poem);
		lambdaReadLines(address);
	}
}
