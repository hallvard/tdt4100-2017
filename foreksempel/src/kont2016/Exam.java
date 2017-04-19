package kont2016;

public class Exam implements Comparable<Exam> {

	private final Course course;
	private final char grade;
	
	public Exam(Course course, char grade) {
		if (grade < 'A' || grade > 'F') {
			throw new IllegalArgumentException("Illegal grade");
		}
		this.course = course;
		this.grade = grade;
	}
	
	public boolean isPass() {
		return grade != 'F';
	}
	
	public char getGrade() {
		return grade;
	}

	public Course getCourse() {
		return course;
	}
	
	@Override
	public int compareTo(Exam other) {
		return this.course.compareTo(other.course);
	}
}
