package eksamensforelesning;

import java.util.ArrayList;
import java.util.List;

public class Attraction implements Location{
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeightRequirement() {
		return heightRequirement;
	}
	public void setHeightRequirement(int heightRequirement) {
		this.heightRequirement = heightRequirement;
	}
	public int getMaxAmountOfCustomers() {
		return maxAmountOfCustomers;
	}
	public void setMaxAmountOfCustomers(int maxAmountOfCustomers) {
		this.maxAmountOfCustomers = maxAmountOfCustomers;
	}
	public Attraction(String name, int heightRequirement, int maxAmountOfCustomers) {
		this.name = name;
		this.heightRequirement = heightRequirement;
		this.maxAmountOfCustomers = maxAmountOfCustomers;
	}
	private String name; 
	private int heightRequirement ; 
	private int maxAmountOfCustomers ;
	private List<Customer> peopleOnBoard = new ArrayList<Customer>(); 
	private List<Customer> peopleInQueue = new ArrayList<Customer>(); 
	
	public boolean addToQueue(Customer customer){
		if(isLegalRider(customer)){
			if(peopleOnBoard.size()==maxAmountOfCustomers){
				peopleInQueue.add(customer); 
			}
			else{
				peopleOnBoard.add(customer); 
			}
			if(!(customer.getAttraction()==this)){
				customer.takeAttraction(this);}
			return true ; 
	}
		else{
			return false; 
		}
		}
	
	public void doneOnBoard(Customer customer){
		peopleOnBoard.remove(customer); 
		if(customer.getAttraction()==this){
			customer.goOffAttraction(); }
		if(peopleInQueue.size()>= 1){
			peopleOnBoard.add(peopleInQueue.remove(0)); }
	}
	public boolean hasCustomer(Customer customer){
		return peopleOnBoard.contains(customer) || peopleInQueue.contains(customer); 
	}
	
	public boolean isLegalRider(Customer customer){
		return customer.getHeight()>= heightRequirement-1; 
	}
	
	
	@Override
	public int getLocation() {
		return 100; 
	} 
	public String toString(){
		String s = "people on board: \n"; 
		for(Customer customer: peopleOnBoard){
			s +=  customer.getName() + ", \n"; 
		}
		s += "people in queue: \n"; 
		for(Customer customer: peopleInQueue){
			s += ", " + customer.getName(); 
		}
		return s; 
	}
	
	
	
	

}
