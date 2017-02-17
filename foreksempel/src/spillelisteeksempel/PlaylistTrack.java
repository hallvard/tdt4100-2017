package spillelisteeksempel;

public class PlaylistTrack {

	// playlista som PlaylistTrack er en del av
	// final angir at playlist settes én gang, i konstruktøren
	private final Playlist playlist;
	// sporet som PlaylistTrack er koblet til
	// final angir at track settes én gang, i konstruktøren
	private final Track track;
	
	// sporet spilles av fra start, som regnes fra starten
	private int start;
	// sporet spilles av til end, som regnes fra enden hvis den er <= 0, ellers fras tarten
	private int end;
	
	public PlaylistTrack(Playlist playlist, Track track, int start, int end) {
		checkStartEnd(track, start, end);
		// konstruktøren trenger en referanse til Playlist-objektet,
		// for å kunne sjekke om endringer i start og end er lov
		this.playlist = playlist;
		this.track = track;
		this.start = start;
		this.end = end;
	}

	// hjelpemetode for validering
	private void checkStartEnd(Track track, int start, int end) {
		if (end > track.getLength()) {
			throw new IllegalArgumentException("End kan ikke være større enn lengden");
		}
		if (getEnd(end, track.getLength()) < start) {
			throw new IllegalArgumentException("End kan ikke være mindre enn start");
		}
	}
	
	public PlaylistTrack(Playlist playlist, Track track) {
		this(playlist, track, 0, 0); // tilsvarer hele lengden
	}
	
	Track getTrack() {
		return track;
	}

	public int getStart() {
		return start;
	}
	
	public void setStartEnd(int start, int end) {
		// sjekker om start, end er gyldige, for dette objektet alene
		checkStartEnd(track, start, end);
		int oldPlayLength = this.getPlayLength();
		int newPlayLength = this.getPlayLength(start, end);
		// sjekker om den nye spillelengden totalt sett er lov
		playlist.checkPlayLength(newPlayLength - oldPlayLength);
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
	
	// hjelpemetode, beregner spillelengden for spesifikke start- og end-verdier
	int getPlayLength(int start, int end) {
		return getEnd(end, track.getLength()) - start;
	}

	public int getPlayLength() {
		return getPlayLength(start, end);
	}
}
