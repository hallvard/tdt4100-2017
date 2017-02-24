package grensesnitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[Person " + name + "]";
	}
	
	private List<Pet> pets = new ArrayList<Pet>();

	public boolean hasPet(Pet pet) {
		return pets.contains(pet);
	}
	
	//Sorterer liste ved å bruke CompareTo-metoden inne i Dog-klassen
	public void printAndSortPets(){
		
		Collections.sort(pets);
		
		for(Pet pet: pets){
			System.out.println(pet);
		}

	}
	//Sorterer lista med å bruke DogComparator klassen, før den printer ut
	public void printAndSortPetsByComparatorClass(){
		PetComparator comparator = new PetComparator(); 
		pets.sort(comparator);
		
		for(Pet pet: pets){
			System.out.println(pet);
		}
	}
	
	public void addPet(Pet pet) {
		if (hasPet(pet)) {
			return;
		}
		pets.add(pet);
		pet.setOwner(this);
	}

	public void removePet(Pet pet) {
		if (! hasPet(pet)) {
			return;
		}
		pets.remove(pet);
		pet.setOwner(null);
	}

	public static void main(String[] args) {
		Dog pluto = new Dog("Pluto"); 
		Dog pet1 = new Dog("Wario");
		Person person1 = new Person("Hallvard");
		Person person2 = new Person("Jens");
		
		pet1.setOwner(person1);
		System.out.println(pet1.getOwner() == person1);
		System.out.println(person1.hasPet(pet1));
		
		pet1.setOwner(person2);
		System.out.println(pet1.getOwner() == person2);
		System.out.println(! person1.hasPet(pet1));
		System.out.println(person2.hasPet(pet1));
		
		pet1.setOwner(null);
		System.out.println(pet1.getOwner() == null);
		System.out.println(! person2.hasPet(pet1));
		
		person1.addPet(pet1);
		System.out.println(pet1.getOwner() == person1);
		System.out.println(person1.hasPet(pet1));
		
		person2.addPet(pet1);
		System.out.println(pet1.getOwner() == person2);
		System.out.println(! person1.hasPet(pet1));
		System.out.println(person2.hasPet(pet1));
		
		Dog amund = new Dog("Amund"); 
		person1.addPet(pluto); 
		person1.addPet(pet1);
		person1.addPet(amund);
		person1.printAndSortPetsByComparatorClass();
		
	}
}
