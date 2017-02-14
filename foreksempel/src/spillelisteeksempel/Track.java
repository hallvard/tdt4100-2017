package spillelisteeksempel;

public class Track {

	private String title;
	// final angir at length settes én gang, i konstruktøren
	private final int length;

	public Track(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
}
