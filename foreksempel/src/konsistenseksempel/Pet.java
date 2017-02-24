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
		if(this.owner == owner){
			return ; 
		}
		if (this.owner != null) {
			this.owner.removePet(this);
		}
		this.owner = owner;
		if (this.owner != null) {
			this.owner.addPet(this);
		}
	}
}
