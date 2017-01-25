package of3;

public class Student {

	int id;
	String name;
	int age;
	
	// Konstruktør
	public Student(String name, int age) {
		this.id = (int) (Math.random() * 50 + 1); // Tilfeldig tall i [1, ..., 100]
		this.name = name;
		this.age = age;
	}
	// Ikke-statisk metode
	public void incrementAge() {
		this.age++;
	}
	
	public static int howManyStudentsAreThere() {
		return 2;
	}
	
	// Statisk metode
	public static void main(String[] args) {
		// Opprett to studenter
		Student student1 = new Student("Ola Nordmann", 18);
		Student student2 = new Student("Kari Nordmann", 19);
		// If-else
		if (student1.age >= student2.age) {
			System.out.println("Ola er eldre enn Kari");
		} else {
			System.out.println("Kari er eldre enn Ola");
		}
		
		// Boolske operatorer
		// Merk parentes-bruk
		if ((student1.age <= student2.age) && (student1.id <= student2.id)) {
			System.out.println("Ola sitt id-nummer: " + student1.id);
			System.out.println("Kari sitt id-nummer: " + student2.id);
			System.out.println("Kari er eldre enn Ola, og Kari har større id-nummer enn Ola");
		}
		
		// for-løkke
		for (int i = 0; i < student1.name.length(); i++) {
			System.out.println(i + "'te bokstav i Ola sitt navn: " + student1.name.charAt(i));
		}
		
		// while-løkke
		while(student1.age < 30) {
			student1.incrementAge(); // Kall til ikke-statisk metode
			System.out.println("Ojsann. Der ble visst Ola ett år eldre. \nHan er nå " + student1.age + " år gammel. Tiden flyr, kan man si.\n");
		}
		
		// Kall til statisk metode, merk stor S
		int numberOfStudents = Student.howManyStudentsAreThere();
		System.out.println("Det er " + numberOfStudents + " studenter.");
		// Dette under fungerer ikke
		// Cannot make a static reference to the non-static field Student.age
		// System.out.println(Student.age);
	}
	
}
