package spillelisteeksempel;

import java.util.List;

public class Playlist {

	private String title;
	private int maxLength;
	private List<PlaylistTrack> tracks;

	public Playlist(int maxLength) {
		this.maxLength = maxLength;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if (! isValidTitle(title)) {
			throw new IllegalArgumentException("Invalid title: " + title);
		}
		this.title = title;
	}

	private boolean isValidTitle(String title) {
		for (int i = 0; i < title.length(); i++) {
			char c = title.charAt(i);
			if (! (Character.isLetter(c) || Character.isDigit(c) || " ,-".indexOf(c) >= 0)) {
				return false;
			}
		}
		return true;
	}
	
	public int getMaxLength() {
		return maxLength;
	}
	
	public int getPlayLength() {
		int sum = 0;
		for (PlaylistTrack track : tracks) {
			sum = sum + track.getPlayLength();
		}
		return sum;
	}
}
