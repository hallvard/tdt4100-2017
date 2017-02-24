package konsistenseksempel;

public class Pet{
	
	private String name;
	
	public Pet(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[Pet " + name + "]";
	}
	
	private Person owner;
	
	public Person getOwner() {
		return owner;
	}
	
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
}
