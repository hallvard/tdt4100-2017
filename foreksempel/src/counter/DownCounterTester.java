package counter;

public class DownCounterTester {

	public static void main(String[] args) {
		DownCounter downcounter = new DownCounter(3);
		System.out.println(downcounter.isFinished());
		downcounter.countDown();
		System.out.println(downcounter.isFinished());
		downcounter.countDown();
		System.out.println(downcounter.isFinished());
		downcounter.countDown();
		System.out.println(downcounter.isFinished());
		downcounter.countDown();
		System.out.println(downcounter.isFinished());
	}
}
