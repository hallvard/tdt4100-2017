package of12;

public abstract class SinglePlayerGameResult 
	implements GameResult {

	String player;
	
	public SinglePlayerGameResult(String player) {
		this.player = player;
	}
	
	public int compareTo(GameResult other) {
		// Standard implementasjon
		return 0;
	}
	
	public String getGameString() {
		return "Spillet spilles av " + player;
	}
	
}
