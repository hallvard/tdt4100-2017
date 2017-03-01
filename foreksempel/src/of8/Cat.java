package of8;

public class Cat implements Animal {

	private String name;
	private int age;
	static String CLASS_NAME; // final = konstant, kan ikke endre verdi, felles for alle Cat-obj.
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		// CLASS_NAME = name + " er en katt";
	}
	
	public static void main(String[] args) {
		Cat mons = new Cat("Mons", 10);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String makeAnimalSound() {
		return name + " sier " + meow();
	}
	
	public String meow() {
		return "mjau";
	}

}
