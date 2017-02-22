package of6;

import java.util.Scanner;

/**
 * Enkel minesveiper-implementasjon i konsollen. Tredelt: Hovedprogram i denne
 * klassen, brettrepresentasjon og -logikk i MinesweeperBoard.java og
 * cellelogikk i MinesweeperCell.java.
 */

public class MinesweeperConsoleProgram {

	MinesweeperBoard board;
	
	public MinesweeperConsoleProgram() {
		board = new MinesweeperBoard(5, 5, 0.15);
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Velkommen til minesveiper!\n");
		int moveNo = 0;
		long elapsedTime = System.nanoTime();
		do {
			System.out.println(board);
			System.out.print("Velg rad og kolonne: ");
			String rowCol = scanner.next();

//			Hent ut rad og kolonne, bruk ',' som skilletegn
			int row = -1, col = -1;
			try {
				row = Integer.parseInt(rowCol.substring(0, 
						rowCol.indexOf(',')));
				col = Integer.parseInt(rowCol.substring(rowCol.indexOf(',') + 1, 
						rowCol.length()));
//				Q: Hvorfor utløser ikke Eclipse "klaging" på throws-nøkkelordet?
//				A: De aller fleste objektene mine vil kunne utløse unchecked E's,
//				så det blir unødvendig mye å forholde seg til.
				try {
					board.openCell(row, col);
				} catch (MinesweeperBoardException mbe) {
					System.out.println(mbe.getMessage());
				} finally {
					moveNo++;
					System.out.println("Flytt nr. " + moveNo);
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Galt tallformat: " + nfe.getMessage());
			} catch(StringIndexOutOfBoundsException se) {
				se.printStackTrace();
				System.out.println();
			}			
		} while (board.gameOver() == 0);
		
		String endString = (board.gameOver() == 2 ? "Du vant!" : "Du tapte...");
		
		String elapsedTimeString = String.format("%.2f", 
				(System.nanoTime() - elapsedTime)/Math.pow(10, 9));
		System.out.println(endString +
				"\nAntall flytt: " + moveNo +
				"\nTid brukt: " + elapsedTimeString + " s.");
		
		System.out.println(board);
		scanner.close();
	}
	
	public static void main(String[] args) {
		MinesweeperConsoleProgram program = new MinesweeperConsoleProgram();
		program.run();
	}
	
	
}
