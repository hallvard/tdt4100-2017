package of12;

public interface GameResult extends Comparable<GameResult> {
	// Comparable => compareTo(GameResult other)
	
	public String getGameString();
	public String getResultString();

}
