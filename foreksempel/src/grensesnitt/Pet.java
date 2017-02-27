package grensesnitt;

public interface Pet extends Comparable<Pet>{
	
	//Grensesnitt som sier hvilke metoder alle Pets skal ha
	public Person getOwner() ; 
	
	public String getName(); 
	
	public void setOwner(Person p); 

}
