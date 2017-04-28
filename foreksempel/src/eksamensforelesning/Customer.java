package eksamensforelesning;

public class Customer {
	
	private Attraction attraction; 
	
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
	}

	
}
