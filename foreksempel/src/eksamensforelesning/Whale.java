package eksamensforelesning;

public class Whale extends Animal{
	
	String race ;
	public Whale(String name, String race){
		super(name, false, 20); 
		this.race = race; 
	}
	
	
	@Override
	public void sayHello(){
		System.out.println("Whales cannot speak");
	}
	public void beaWhale(){
		System.out.println("is very whale");
	}


	@Override
	public int getExpectedLifeTime() {
		return 95; 
	}
	
	public static void main(String[] args) {
		Whale rudolf = new Whale("Rudolf", "Blåhval"); 
		rudolf.beaWhale(); 
		Animal rudolf2 = (Animal) rudolf; 
		
		
	}
}
