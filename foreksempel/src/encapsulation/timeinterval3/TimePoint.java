package encapsulation.timeinterval3;

public class TimePoint {

	private int hour, min;
	
	public TimePoint(int hour, int min) {
		TimeInterval.checkInteger(0, 23, hour, "Hour");
		TimeInterval.checkInteger(0, 59, min, "Min");
		this.hour = hour;
		this.min = min;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", getHour(), getMin());
	}

	public int getHour() {
		return hour;
	}
	
	public int getMin() {
		return min;
	}
}
