package patterns.observable.gridgame;

import java.io.IOException;

/**
 * Generic grid game interface, suitable for use with GenericGameController
 *
 * @param <T> The type of the element representing each cell.
 */
public interface GenericGridGame<T> {

	/**
	 * Interprets command as appropriate for this game
	 * @param command the command
	 */
	public void getInput(String command);

	// undo and redo
	
	/**
	 * Tells if undo is available in the game's current state
	 */
	public boolean canUndo();
	/**
	 * Undoes the last command
	 */
	public void undo();

	/**
	 * Tells if redo is available in the game's current state
	 */
	public boolean canRedo();
	/**
	 * Redos the last undone command
	 */
	public void redo();

	// loading and saving 
	
	/**
	 * Loads a previously stored state from fileName, and uses it as this game's state
	 * @param fileName the file to read from
	 * @throws IOException
	 */
	public void load(String fileName) throws IOException;
	/**
	 * Saves this game's state to fileName, so it can be restored later using load
	 * @param fileName the file to read from
	 * @throws IOException
	 */
	public void save(String fileName) throws IOException;

	// grid, for showing the state as a grid
	
	/**
	 * Returns the number of columns in this game's grid
	 */
	public int getColumnCount();
	/**
	 * Returns the number of rows in this game's grid
	 */
	public int getRowCount();
	
	/**
	 * The returns an object representing the cell at col, row
	 * @param col the x-coordinate of the cell
	 * @param row the y-coordinate of the cell
	 * @return the object representing the cell at col, row
	 */
	public T getCell(int col, int row);
	
	/**
	 * Returns an array of strings, which are combined (drawn on top of each other
	 * to visualize the each cell represented by t.
	 * Each string can either be the name of an image file (including the file extension), or
	 * a string with the format s@x,y#w,h,
	 * where s is a text that is drawn into an image of size w,h at position x,y.
	 * The position and or image dimensions may be ommited. 
	 * @param t
	 * @return
	 */
	public String[] getImages(T t);
	
	//

	/**
	 * Add a listener that will be notified of changes to this game's grid 
	 */
	public void addGridListener(GridListener<T> listener);
	/**
	 * Remove a listener 
	 */
	public void removeGridListener(GridListener<T> listener);
}
