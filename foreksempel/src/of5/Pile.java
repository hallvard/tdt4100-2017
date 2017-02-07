package of5;

public class Pile {

	private int currentPieceCount;

	public Pile(int pileSize) {
		this.currentPieceCount = pileSize;
	}

	public boolean isValidMove(int numberToRemove) {
		return numberToRemove > 0 && numberToRemove <= currentPieceCount;
	}

	public void removePieces(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("Number must be greater than zero");
		}
		if (number > currentPieceCount) {
			throw new IllegalArgumentException("Number cannot be greater than the pile (size)");
		}
		
		currentPieceCount -= number;
	}

	public int getNumber() {
		return currentPieceCount;
	}
	
}