package of5;

/**
 * Gjennomgått i øvingsforelesning 08.02.2017.
 *
 */

public class Cell {

	/*
	 * value: 0=tom, 1=mat, 2=gift
	 */
	
	private int value;
	
	public Cell(int value) {
		this.value = value;
	}
	
	public boolean isEmpty() {
		//if (value == 0) {
		//	return true;
		//} return false;
		System.out.println(value == 0);
		return value == 0;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
	
}
