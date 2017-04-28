package eksamensforelesning;

import java.util.Date;

public class Course {
	
	private String name ;
	private String code ; 
	private static int amountOfCourses = 0; 
	private Date examDate ; 
	private double points ; 
	
	public Course(String name, String code, Date examDate, double points){
		setCode(code); 
		this.name = name ; 
		this.examDate = examDate; 
		this.points = points; 
		amountOfCourses ++ ; 
		
	}
	public Course(){
		amountOfCourses ++ ; 
	}
	public Course(String code, Date examDate, double points){
		
	}
	
	public String getName(){
		return name; 
	}
	public String getCode() {
		return code ; 
	}
	
	public void setCode(String code) {
		if(!code.startsWith("TDT")){
			throw new IllegalArgumentException("Ikke gyldig fagkode"); 
		}
		if(!(code.length() == 7)){
			throw new IllegalArgumentException("Feil antall bokstaver i fagkode"); 
		}
		String str = code.substring(3);
		for(int i = 0; i<str.length(); i++){
			char c = str.charAt(i) ; 
			if(!(Character.isDigit(c))){
				throw new IllegalArgumentException("De siste sifrene var ikke tall"); 
			}
		}
		
		this.code = code; 
		
	}
	
	public static void main(String[] args) {
		Course java = new Course("Java", "TDT410", new Date(2017, 5, 16), 7.5 );
		System.out.println(java.getCode());
		System.out.println(Course.amountOfCourses);
		Course itGK = new Course(); 
		System.out.println(Course.amountOfCourses);
		
		
	}
	
}
