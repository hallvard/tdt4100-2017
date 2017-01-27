package encapsulation;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}

	private void checkInteger(int min, int max, int value, String prop) {
		if (value < min || value > max) {
			throw new IllegalArgumentException(prop + " must be between " + min + " and " + max + ", but was " + value);
		}
	}
	
	private int[] monthLengths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public void setDay(int day) {
		checkInteger(1, 31, day, "Day");
		checkDayMonth(day, this.month);
		checkLeapYear(day, this.month, this.year);
		this.day = day;
	}
	
	private void checkDayMonth(int day, int month) {
		if (day > monthLengths[month - 1]) {
			throw new IllegalArgumentException("Day must be between below " + monthLengths[month - 1] + ", but was " + day);
		}
	}
	
	private void checkLeapYear(int day, int month, int year) {
	}

	public void setMonth(int month) {
		checkInteger(1, 12, month, "Month");
		checkDayMonth(this.day, month);
		this.month = month;
	}
	
	public void setYear(int year) {
		checkInteger(1900, 2100, year, "Year");
		this.year = year;
	}
}
