package counter;

public class DownCounter {

	int counter;
	
	DownCounter(int initCounter) {
		counter = initCounter;
	}
	
	boolean isFinished() {
		return counter == 0;
	}
	
	void countDown() {
		if (! isFinished()) {
			counter = counter - 1;
		}
	}
}
