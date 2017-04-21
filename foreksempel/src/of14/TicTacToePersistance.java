package of14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface TicTacToePersistance {
	public void load(TicTacToe ticTacToe, InputStream inputStream) throws IOException;
	public void save(TicTacToe ticTacToe, OutputStream outputStream) throws IOException;
	
}
