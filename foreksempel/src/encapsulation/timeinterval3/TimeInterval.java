package encapsulation.timeinterval3;

public class TimeInterval {

	private TimePoint start, end;
	
	public TimeInterval(int startHour, int startMin, int endHour, int endMin) {
		start = new TimePoint(startHour, startMin);
		end = new TimePoint(endHour, endMin);
		int duration = computeDuration(startHour, startMin, endHour, endMin);
		checkInteger(0, 24 * 60, duration, "Duration");
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d-%02d:%02d", getStartHour(), getStartMin(), getEndHour(), getEndMin());
	}

	static void checkInteger(int min, int max, int value, String prop) {
		if (value < min || value > max) {
			throw new IllegalArgumentException(prop + " must be between " + min + " and " + max + ", but was " + value);
		}
	}
	
	public TimePoint getStart() {
		return new TimePoint(start.getHour(), start.getMin());
	}

	public TimePoint getEnd() {
		return end;
	}
	
	public int getStartHour() {
		return start.getHour();
	}
	
	public int getStartMin() {
		return start.getMin();
	}
	
	public int getEndHour() {
		return end.getHour();
	}
	
	public int getEndMin() {
		return end.getMin();
	}

	private int computeDuration(int startHour, int startMin, int endHour, int endMin) {
		return (endHour - startHour) * 60 + (endMin - startMin);
	}

	public int getDuration() {
		return computeDuration(getStartHour(), getStartMin(), getEndHour(), getEndMin());
	}

	//

	public static void main(String[] args) {
		// lag tidsintervall tilsvarende tirsdagsforelesningen
		TimeInterval timeInterval = new TimeInterval(14, 15, 16, 00);
		System.out.println(timeInterval.getStart());
		System.out.println(timeInterval.getStart().getHour());
		System.out.println(timeInterval.getEnd());
		// beregn lengden, skal bli 2 * 45 + 15 = 105
		System.out.println(timeInterval.getDuration());
		// skal utløse unntak
		new TimeInterval(14, 15, 14, 00);
	}
}
