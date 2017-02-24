package grensesnitt;

public class Dog implements Pet{
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[Dog " + name + "woof]";
	}
	
	
	
	private Person owner;
	
	
	
	public void setOwner(Person owner) {
		//Hvis eieren allerede er riktig trenger du ikke gjøre noe
		if(this.owner == owner){
			return ; 
		}
		//Fjerner seg selv fra pet til gamle eieren dersom det er en gammel eier
		if (this.owner != null) {
			this.owner.removePet(this);
		}
		this.owner = owner;
		//Dersom du nå la til en ny eier, legg til dette dyret hos eieren
		if (this.owner != null) {
			this.owner.addPet(this);
		}
	}

	@Override
	public Person getOwner() {
		return owner; 
		
	}


	@Override
	public String getName() {
		return name; 
	}

	@Override
	public int compareTo(Pet otherPet) {
		return this.name.compareTo(otherPet.getName()); 
	}
}
