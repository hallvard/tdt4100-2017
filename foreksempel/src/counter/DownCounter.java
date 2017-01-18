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
	
	public static void main(String[] args) {
		DownCounter counter1 = new DownCounter(5);
		System.out.println(counter1.isFinished());
	}
}
