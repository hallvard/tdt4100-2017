package eksamensforelesning;

public abstract class Animal {

	protected String name; 
	protected boolean isPet ; 
	protected int age;
	
	public Animal(String name, boolean isPet, int age){
		this.name = name; 
		this.isPet = isPet; 
		this.age = age; 
	}
	
	public String toString(){
		return "Jeg heter " + name; 
	}
	public void sayHello(){
		System.out.println("something something");
	}
	public abstract int getExpectedLifeTime(); 
	
	
	public static void main(String[] args) {
		
	}
	
}
