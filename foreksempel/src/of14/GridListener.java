package of14;

public interface GridListener<T> {

	/**
	 * Reports that a (sub-)rectangle of the grid of gridGame has been modified.
	 * The position and dimensions of the rectangle is provided as four arguments. 
	 * @param gridGame the game that has been modified
	 * @param col the x-coordinate of the rectangle that has changed
	 * @param row the y-coordinate of the rectangle that has changed
	 * @param width the width of the rectangle that has changed
	 * @param height the height of the rectangle that has changed
	 */
	public void gridChanged(GenericGridGame<T> gridGame, int col, int row, int width, int height);
}
