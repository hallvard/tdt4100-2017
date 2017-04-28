package eksamensforelesning;

public class Dog extends Animal{
	
	
	public Dog(String name, int age){
		super(name, true, age); 
	}
	
	public void run(){
		System.out.println("Running and looking happy");
	}

	@Override
	public int getExpectedLifeTime() {
		return 15 ; 
	}
}
