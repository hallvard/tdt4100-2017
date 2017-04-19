package kont2016;

import java.util.ArrayList;
import java.util.Collection;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	private Collection<Course> courses = new ArrayList<Course>();
	private Collection<Exam> exams = new ArrayList<Exam>();
	
	public boolean addCourse(Course course) {
		for (Course existing : courses) {
			if (existing.getTime().equals(course.getTime()) && existing.getCode().equals(course.getCode())) {
				return false;
			}
		}
		courses.add(course);
		return true;
	}
	
	public boolean hasCourse(String code) {
		for (Course existing : courses) {
			if (existing.getCode().equals(code)) {
				return true;
			}
		}
		return false;
	}
	
	public void addExam(Course course, char grade) {
		if (courses.contains(course)) {
			for (Exam existing : exams) {
				if (existing.getCourse() == course && existing.isPass()) {
					return;
				}
			}
			exams.add(new Exam(course, grade));
		}
	}
}
