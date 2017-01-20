package counter;

public class Counter {

	int counter, end;
	
	public Counter(int upperLimit) {
		end = upperLimit;
		counter = 1;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public boolean count() {
		if (counter < end) {
			counter = counter + 1;
		}
		return counter >= end;
	}
	
	public static void main(String[] args) {
		Counter counter1 = new Counter(15);
		Counter counter2 = counter1;
		System.out.println(counter1.getCounter());
		while (! counter1.count()) {
			System.out.println(counter2.getCounter());
		}
		System.out.println(counter2.getCounter());
	}
}
