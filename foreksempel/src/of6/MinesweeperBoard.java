package of6;

import java.util.ArrayList;

public class MinesweeperBoard {

	protected int rowCount, colCount;
	private boolean gameOver = false;
	
	private ArrayList<ArrayList<MinesweeperCell>> cells;
	
	public MinesweeperBoard(int rowCount, int colCount, double mineProb) {
		this.rowCount = rowCount;
		this.colCount = colCount;
		cells = new ArrayList<ArrayList<MinesweeperCell>>();
		for (int i = 0; i < rowCount; i++) {
			cells.add(new ArrayList<MinesweeperCell>());
			for (int j = 0; j < colCount; j++) {
				MinesweeperCell cell = new MinesweeperCell();
				if (Math.random() < mineProb) {
					cell.setBomb();
				}
				cells.get(i).add(cell);
			}
		}
	}
	
	public void openCell(int rowIndex, int colIndex) {
		
//		Check if argument exceeds row and/or column bounds
		if (rowIndex >= rowCount || rowIndex < 0 || colIndex >= colCount ||
			colIndex < 0) {
			throw new MinesweeperBoardException("Feil! Utenfor nedre og/eller " + 
					" øvre skranke for brettet.");
		}
		
		if (cells.get(rowIndex).get(colIndex).getIsBomb()) {
			cells.get(rowIndex).get(colIndex).setBoardValue('*');;
			gameOver = true;
		} else {			
//			Calculate # of adjacent cells
			int adjCellCount = 0;
			if (rowIndex - 1 >= 0) {
				adjCellCount += (cells.get(rowIndex - 1).get(colIndex).getIsBomb()
						? 1 : 0);
			}
			if (rowIndex + 1 < rowCount) {
				adjCellCount += (cells.get(rowIndex + 1).get(colIndex).getIsBomb()
						? 1 : 0);
			}
			if (colIndex - 1 >= 0) {
				adjCellCount += (cells.get(rowIndex).get(colIndex - 1).getIsBomb()
						? 1 : 0);
			}
			if (colIndex + 1 < colCount) {
				adjCellCount += (cells.get(rowIndex).get(colIndex + 1).getIsBomb()
						? 1 : 0);
			}
			cells.get(rowIndex).get(colIndex).setBoardValue(
					(char) ('0' + adjCellCount));
		}
	}
	
	public int gameOver() {
		if (!gameOver) {
			int cellCount = 0;
			int bombCount = 0;
			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					if (cells.get(i).get(j).getBoardValue() == 'x') {
						cellCount++;
						if (cells.get(i).get(j).getIsBomb()) {
							bombCount++;
						}
					}
				}
			}
			return (cellCount == bombCount ? 2 : 0);
		}
		return 1;
	}

	public String toString() {
		String boardString = "";
		for (ArrayList<MinesweeperCell> row : cells) {
			for (MinesweeperCell c : row) {
				boardString += c.getBoardValue();
			}
			boardString += "\n";
		}
		return boardString;
	}
	
	
//	public static void main(String[] args) {
//		MinesweeperBoard board = new MinesweeperBoard(10, 10, 0.15);
//		System.out.println(board);
//		board.openCell(4, 4);
//		System.out.println(board);
//	}
	
}
