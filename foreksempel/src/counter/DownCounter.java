package counter;

public class DownCounter {

	int counter;
	
	public DownCounter(int initCounter) {
		counter = initCounter;
	}
	
	public boolean isFinished() {
		return counter == 0;
	}
	
	public void countDown() {
		if (! isFinished()) {
			counter = counter - 1;
		}
	}
}
