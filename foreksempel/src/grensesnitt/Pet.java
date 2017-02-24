package grensesnitt;

public interface Pet extends Comparable<Pet>{
	
	
	public Person getOwner() ; 
	
	public String getName(); 
	
	public void setOwner(Person p); 

}
