package of12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SokobanGameResult extends SinglePlayerGameResult{

	int moves;
	int pushes;
	
	public SokobanGameResult(String player,
			int moves, int pushes) {
		super(player);
		this.moves = moves;
		this.pushes = pushes;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResultString() {
		return moves + " moves, " + pushes + " pushes";
	}
	
	@Override
	public int compareTo(GameResult o) {
		if (!(o instanceof SokobanGameResult)) {
			throw new IllegalArgumentException("Feil spill");
		}
		SokobanGameResult other = (SokobanGameResult) o;
		int diff = (moves + pushes) - (other.moves + other.pushes);
		return diff;
	}
	
	public static void main(String[] args) {
		List<GameResult> res = new ArrayList<>();
		res.add(new SokobanGameResult("Hallvard", 100, 50));
		res.add(new SokobanGameResult("Hallvard", 75, 20));
		Collections.sort(res);
		System.out.println(res);
	}
	
}
