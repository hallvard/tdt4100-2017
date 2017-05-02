package eksamensforelesningPart2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReaderWriterExample {

	
	
	public static void main(String[] args) {
		File file = new File("Eksamen2017");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			fileWriter.write("Hello world!");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("Dette er en linje!");
			
			printWriter.println("Dette er linje nr 2!");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Noe gikk galt!");
		} finally {
			try {
				if (fileWriter != null){
					fileWriter.close();
				}
			} catch (IOException e) {
				;
			}
		}

		
		try {
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader.read());
			BufferedReader buffReader = new BufferedReader(fileReader);
			System.out.println(buffReader.readLine());
			Scanner scanner = new Scanner(buffReader);
			System.out.println(scanner.nextLine());
			scanner.close();
		} catch (Exception e) {
			;
		}
	}
}
