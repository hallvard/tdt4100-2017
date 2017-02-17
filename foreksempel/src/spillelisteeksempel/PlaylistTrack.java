package spillelisteeksempel;

public class PlaylistTrack {

	// sporet som PlaylistTrack er koblet til
	private Track track;
	
	// sporet spilles av fra start, som regnes fra starten
	private int start;
	// sporet spilles av til end, som regnes fra enden hvis den er <= 0, ellers fras tarten
	private int end;
	
	public PlaylistTrack(Track track, int start, int end) {
		if (end > track.getLength()) {
			throw new IllegalArgumentException("End kan ikke være større enn lengden");
		}
		if (getEnd(end, track.getLength()) < start) {
			throw new IllegalArgumentException("End kan ikke være mindre enn start");
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

	public int getStart() {
		return start;
	}
	
	public void setStartEnd(int start, int end) {
		if (end > track.getLength()) {
			throw new IllegalArgumentException("End kan ikke være større enn lengden");
		}
		if (getEnd(end, track.getLength()) < start) {
			throw new IllegalArgumentException("End kan ikke være mindre enn start");
		}
		this.start = start;
		this.end = end;
	}
	
	public int getEnd() {
		return getEnd(end, track.getLength());
	}
	
	// hjelpemetode, beregner den effektive enden for spesifikk end og lengde
	private static int getEnd(int end, int length) {
		if (end <= 0) {
			return length + end;
		} else {
			return end;
		}
	}
	
	int getPlayLength(int start, int end) {
		return getEnd(end, track.getLength()) - start;
	}

	public int getPlayLength() {
		return getPlayLength(start, end);
	}
}
