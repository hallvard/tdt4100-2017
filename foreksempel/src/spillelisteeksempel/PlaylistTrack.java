package spillelisteeksempel;

public class PlaylistTrack {

	// sporet som PlaylistTrack er koblet til
	private Track track;
	
	// sporet spilles av fra start, som regnes fra starten
	private int start;
	// sporet spilles av til end, som regnes fra enden hvis den er <= 0, ellers fras tarten
	private int end;
	
	public PlaylistTrack(Track track, int start, int end) {
		if (getPlayLength(track.getLength(), start, end) < 0) {
			throw new IllegalArgumentException("Spillelengden kan ikke være negativ!");
		}
		this.track = track;
		this.start = start;
		this.end = end;
	}
	
	public PlaylistTrack(Track track) {
		this(track, 0, 0); // tilsvarer hele lengden
	}
	
	Track getTrack() {
		return track;
	}

	// hjelpemetode, beregner spillelengden for spesifikk lengde, start, end
	private static int getPlayLength(int length, int start, int end) {
		if (end <= 0) {
			return length + end - start;
		} else {
			return end - start;
		}
	}
	
	public int getPlayLength() {
		return getPlayLength(track.getLength(), start, end);
	}
}
