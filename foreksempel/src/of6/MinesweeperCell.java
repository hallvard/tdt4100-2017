package of6;


public class MinesweeperCell {

	private boolean isBomb = false;
	private char boardValue = 'x';
	
	public void setBomb() {
		isBomb = true;		
	}

	public boolean getIsBomb() {
		return isBomb;
	}
	
	public char getBoardValue() {
		return boardValue;
	}
	
	public void setBoardValue(char boardValue) {
		this.boardValue = boardValue;
	}

}
