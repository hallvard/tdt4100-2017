package of8;

public class Dog implements Animal {
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String makeAnimalSound() {
		return name + " sier " + bark();
	}
	
	public String bark() {
		return "bjeff";
	}

}
