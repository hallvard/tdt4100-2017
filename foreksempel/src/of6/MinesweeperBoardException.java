package of6;

@SuppressWarnings("serial")
// IndexOutOfBoundsException er en RuntimeException, trenger ikke throws, etc.
public class MinesweeperBoardException extends IndexOutOfBoundsException {
	
	public MinesweeperBoardException() {
		
	}
	
	public MinesweeperBoardException(String exceptionMessage) {
		super(exceptionMessage);
	}

}



