package eksamensforelesning;

public class Customer {
	
	private Attraction attraction; 
	
	public Attraction getAttraction(){
		return attraction; 
	}
	public Customer(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	private String name; 
	private int height ; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void startCrying(){
		System.out.println("Cries highly because I am low");
	}
	public void takeAttraction(Attraction att){
		this.attraction= att; 
		if(att.hasCustomer(this)){
			return; 
		}
		if(!att.addToQueue(this)){
			this.attraction = null; 
		}
		
	}
	
	public void goOffAttraction(){
		if(this.attraction.hasCustomer(this)){
			this.attraction.doneOnBoard(this); }
		this.attraction = null; 
	}
	
	public String toString(){
		if(attraction != null){
		return name+ " is on " + attraction.getName();  }
		return name; 
	}
	
	public static void main(String[] args) {
		Attraction loopen = new Attraction("Loopen", 100, 2); 
		Customer ola = new Customer("Ola", 120); 
		Customer kari = new Customer("Kari", 160); 
		Customer bob = new Customer("BoB", 210); 
		Customer alice = new Customer("Alice", 99); 
		
		loopen.addToQueue(ola); 
		System.out.println(ola);
		System.out.println(loopen);
		kari.takeAttraction(loopen);
		
		bob.takeAttraction(loopen);
		System.out.println(loopen);
		loopen.doneOnBoard(ola); 
		System.out.println(loopen);
		alice.takeAttraction(loopen);
		System.out.println(loopen);
		System.out.println(alice);
	}

	
}
