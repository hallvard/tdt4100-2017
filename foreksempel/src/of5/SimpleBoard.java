package of5;

/**
 * Gjennomgått i øvingsforelesning 08.02.2017.
 *
 */

public class SimpleBoard {

	private int rows;
	private int columns;
	
	private Cell[][] cells;
	
	public SimpleBoard(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		cells = new Cell[rows][columns];
		// Opprette hver rute i brettet
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				// Lage en tilfeldig rute
				// Tallverdi er i [0,3) => {0,1,2}
				int cellValue = (int) (Math.random()*3);
				cells[i][j] = new Cell(cellValue);
			}
		}
	}
	
	// Intern innkapsling 1.
	private Cell getCell(int row, int column) {
		return cells[row][column];
	}
	
	public String toString() {
		String outStr = "";
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				outStr += this.getCell(i, j); // Intern innkapsling igjen
			}
			outStr += "\n"; // Ny linje i outStr
		}
		return outStr;
	}
	
	// Teller antall tomme ruter (value=0) på en gitt rad
	public int countEmpty(int row) {
		int counter = 0;
		for (int j = 0; j < this.columns; j++) {
			if (this.getCell(row, j).isEmpty()) { // II 3
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		SimpleBoard sb = new SimpleBoard(5,5);
		System.out.println(sb);
		System.out.println("Rad 5 har " + sb.countEmpty(4) + " tomme ruter");
	}
	
}
