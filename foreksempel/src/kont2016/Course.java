package kont2016;

public class Course implements Comparable<Course> {

	private String code;
	
	public Course(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	private double credits;
	
	public double getCredits() {
		return credits;
	}
	
	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	private char semester;
	private int year;
	
	public char getSemester() {
		return semester;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getTime() {
		return String.valueOf(semester) + year;
	}
	
	boolean checkTime(String time) {
		if (time.length() != 3 && time.length() != 5) {
			return false;
		}
		char semester = time.charAt(0);
		if (! (semester == 'S' || semester == 'F')) {
			return false;
		}
		String yearString = time.substring(1);
		try {
			Integer.valueOf(yearString);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public void setTime(String time) {
		if (! checkTime(time)) {
			throw new IllegalArgumentException("Illegal format");
		}
		this.semester = time.charAt(0);
		int year = Integer.valueOf(time.substring(1));
		if (year < 50) {
			year = year + 2000;
		} else if (year < 100) {
			year = year + 1900;
		}
		this.year = year;
	}

	@Override
	public int compareTo(Course other) {
		int diff = this.year - other.year;
		if (diff == 0) {
			return diff;
		}
		return other.semester - this.semester;
	}
}
