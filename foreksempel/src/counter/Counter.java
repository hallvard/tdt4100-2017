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
		Counter counter = new Counter(3);
		System.out.println(counter.getCounter());
		System.out.println(counter.count());
		System.out.println(counter.getCounter());
		System.out.println(counter.count());
		System.out.println(counter.getCounter());
		System.out.println(counter.count());
		System.out.println(counter.getCounter());
		System.out.println(counter.count());
	}
}
