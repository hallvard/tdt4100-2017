package encapsulation.timeinterval3;

public class TimePoint {

	private int hour, min;
	
	public TimePoint(int hour, int min) {
		checkInteger(0, 23, hour, "Hour");
		checkInteger(0, 59, hour, "Min");
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}
	
	public int getMin() {
		return min;
	}
}
