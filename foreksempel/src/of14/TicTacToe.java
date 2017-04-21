package of14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TicTacToe implements GenericGridGame<Character> {

	private String gridString;
	private char player;

	private Stack<TicTacToeMove> undoStack = new Stack<>();
	private Stack<TicTacToeMove> redoStack = new Stack<>();

	private TicTacToePersistance persistance = new DefaultTicTacToePersistance();
	
//	/*
//	 * GridListener
//	 */
	private List<GridListener<Character>> listeners = new ArrayList<>();

	@Override
	public void addGridListener(GridListener<Character> listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeGridListener(GridListener<Character> listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
	
	public void gridChanged(GenericGridGame<Character> gridGame, int col, int row, int width, int height) {
		for (GridListener<Character> listener : listeners) {
			listener.gridChanged(gridGame, col, row, width, height);
		}
	}
	
	

	public TicTacToe() {
		init(new ArrayList<>());
	}

	public void init(List<TicTacToeMove> moves) {
		gridString = "         ";
		player = 'x';
		undoStack.clear();
		redoStack.clear();
		if (moves != null) {
			for (TicTacToeMove m : moves) {
				doMove(m);
				undoStack.push(m);
			}
		}
	}

	@Override
	public int getRowCount() {
		return 3;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	public Character getCell(int x, int y) {
		return gridString.charAt(indexAt(x, y));
	}

	@Override
	public String[] getImages(Character t) {
		String imageDescription = (t == ' ' ? "empty" : String.valueOf(t)) + ".png";
		// String imageDescription = String.valueOf(t);
		return new String[] { imageDescription };
	}

	public void setCell(char c, int x, int y) {
		int index = indexAt(x, y);
		gridString = gridString.substring(0, index) + c + gridString.substring(index + 1);
		gridChanged(this, x, y, 1, 1);
	}

	public boolean isOccupied(int x, int y) {
		return getCell(x, y) != ' ';
	}

	public char getCurrentPlayer() {
		return player;
	}

	public void getInput(String s) {
		play(Character.getNumericValue(s.charAt(0)), Character.getNumericValue(s.charAt(1)));
	}

	public String toString() {
		String str = "";
		for (int y = 0; y <= 2; y++) {
			for (int x = 0; x <= 2; x++) {
				str += " " + gridString.charAt(indexAt(x, y)) + " |";
			}
			str = str.substring(0, str.length() - 2) + "\n-----------\n";
		}
		return str.substring(0, str.length() - 12);
	}

	/*
	 * Grid coordinates: (0,0) | (1,0) | (2,0) --------------------- (0,1) |
	 * (1,1) | (2,1) --------------------- (0,2) | (1,2) | (2,2)
	 */
	public int indexAt(int x, int y) {
		return x + 3 * y;
	}

	public void play(int x, int y) {
		if (!isOccupied(x, y)) {
			TicTacToeMove move = new TicTacToeMove(x, y, player);
			doMove(move);
			undoStack.push(move);
			redoStack.clear();
		}
	}

	private boolean checkNInARow(char c, int n, int x, int y, int dx, int dy) {
		while (n > 0) {
			if (getCell(x, y) != c) {
				return false;
			}
			x += dx;
			y += dy;
			n--;
		}
		return true;
	}

	public boolean isWinner(char c) {
		return
		// rows
		checkNInARow(c, 3, 0, 0, 1, 0) || checkNInARow(c, 3, 0, 1, 1, 0) || checkNInARow(c, 3, 0, 2, 1, 0) || // columns
				checkNInARow(c, 3, 0, 0, 0, 1) || checkNInARow(c, 3, 1, 0, 0, 1) || checkNInARow(c, 3, 2, 0, 0, 1) || // diagonals
				checkNInARow(c, 3, 0, 0, 1, 1) || checkNInARow(c, 3, 2, 0, -1, 1);
	}

	public boolean hasWinner() {
		return isWinner('x') || isWinner('o');
	}

	public boolean isFinished() {
		return hasWinner() || gridString.indexOf(' ') < 0;
	}

	private void doMove(TicTacToeMove move) {
		setCell(move.player, move.x, move.y);
		// Change player
		player = move.player == 'x' ? 'o' : 'x';
	}

	private void undoMove(TicTacToeMove move) {
		setCell(' ', move.x, move.y);
		player = move.player;
	}

	public boolean canUndo() {
		return !undoStack.isEmpty();
	}

	public void undo() {
		if (canUndo()) {
			TicTacToeMove move = undoStack.pop();
			undoMove(move);
			redoStack.push(move);
		}
	}

	public boolean canRedo() {
		return !redoStack.isEmpty();
	}

	public void redo() {
		if (canRedo()) {
			TicTacToeMove move = redoStack.pop();
			doMove(move);
			undoStack.push(move);
		}
	}

	public void load(String fileName) throws IOException {
		persistance.load(this, Files.newInputStream(Paths.get(fileName)));
	}

	public void save(String fileName) throws IOException {
		persistance.save(this, Files.newOutputStream(Paths.get(fileName)));
	}

	public List<TicTacToeMove> getMoves() {
		return new ArrayList<TicTacToeMove>(undoStack);
	}

}