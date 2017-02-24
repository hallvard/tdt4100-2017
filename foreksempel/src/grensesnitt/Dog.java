package grensesnitt;

public class Dog{
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[Dog " + name + "woof]";
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
