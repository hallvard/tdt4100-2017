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
	
	public void addToQueue(Customer customer){
		if(isLegalRider(customer)){
			if(peopleOnBoard.size()==maxAmountOfCustomers){
				peopleInQueue.add(customer); 
			}
			else{
				peopleOnBoard.add(customer); 
			}
	}
		else{
			customer.startCrying(); 
		}
		}
	
	public void doneOnBoard(Customer customer){
		peopleOnBoard.remove(customer); 
		if(peopleInQueue.size()>= 1){
			peopleOnBoard.add(peopleInQueue.get(0)); }
	}
	
	public boolean isLegalRider(Customer customer){
		return customer.getHeight()>= heightRequirement-1; 
	}
	
	
	@Override
	public int getLocation() {
		return 100; 
	} 
	
	
	
	

}
