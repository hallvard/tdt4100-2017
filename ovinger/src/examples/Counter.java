package examples;

/**
 * A class counting from 0 to (and including) an upper limit.
 * @author hal
 *
 */
public class Counter {

	/**
	 * The upper limit (inclusive) for the counter).
	 */
	int end;
	
	/**
	 * The counter, with initial value.
	 */
	int counter = 0;

	/**
	 * Initialises with upper counter limit
	 * @param end
	 */
	Counter(int end) {
		this.end = end;
	}
	
	/**
	 * Returns the current counter value.
	 * @return
	 */
	int getCounter() {
		return counter;
	}
	
	void count() {
		if (counter < end) {
			counter = counter + 1;
		}
	}
	
	/**
	 * Poor man's test of the Counter class 
	 * @param args
	 */
	public static void main(String[] args) {
		Counter counter = new Counter(3);
		System.out.println(counter.getCounter());
		counter.count();
		System.out.println(counter.getCounter());
		counter.count();
		System.out.println(counter.getCounter());
		counter.count();
		System.out.println(counter.getCounter());
		counter.count();
		System.out.println(counter.getCounter());
		counter.count();
	}
}
