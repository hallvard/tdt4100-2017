package spillelisteeksempel;

public class PlaylistTrack {

	private int start, end;
	private Track track;
	
	public int getPlayLength() {
		int length = track.getLength();
		if (end <= 0) {
			return length + end - start;
		} else {
			return end - start;
		}
	}
}
