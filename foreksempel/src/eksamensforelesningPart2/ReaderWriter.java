package eksamensforelesningPart2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReaderWriter {

	
	
	
	public static void main(String[] args) {
		File file = new File("Hello world!");
		System.out.println("Hello!");
		try{
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Even more Hello World!");
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("Hello world!");
			PrintWriter printWriter = new PrintWriter(writer);
			printWriter.println("Is this a new line?");
			writer.close();
		} catch(IOException e) {
			System.out.println("Something went wrong!");
		}
		
		try {
			FileReader fileReader = new FileReader("Hello world!");
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader buffReader = new BufferedReader(reader);
			System.out.println(buffReader.readLine());
			System.out.println(reader.read());
			System.out.println(fileReader.read());
			Scanner scan = new Scanner(System.in);
			
		} catch (IOException e) {
			;
		}
		
	}
}
