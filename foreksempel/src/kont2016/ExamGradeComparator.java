package kont2016;

import java.util.Comparator;

public class ExamGradeComparator implements Comparator<Exam> {

	@Override
	public int compare(Exam e1, Exam e2) {
		char grade1 = e1.getGrade(), grade2 = e2.getGrade();
		return grade1 - grade2;
	}
	
	public final static ExamGradeComparator instance = new ExamGradeComparator();
	
	// Collections.sort(exams, ExamGradeComparator.instance);
}
