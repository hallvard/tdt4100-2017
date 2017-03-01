package of8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		List<Animal> farm = new ArrayList<>();
		farm.add(new Dog("Fido", 5));
		farm.add(new Cat("Oscar", 10));
		farm.add(new Cat("Garfield", 123));
		
		// Stokker om på samlingen (dvs. listen, som er en Collection)
		Collections.shuffle(farm);
		
		for (Animal a : farm) {
			// Polymorfisme: Dyrene behandles likt/uniformt, med makeAnimalSound(),
			// men oppførselen (dvs. implementasjon + output) 
			// er ulikt -- dette basert på (sub)typen til a.
			System.out.println(a.makeAnimalSound());
		}
		
		for (int i = 0; i < farm.size(); i++) {
			Animal a = farm.get(i);
			String output = "";
			if (a instanceof Dog) {
				output = ((Dog) a).bark(); // Casting
			} else if (a instanceof Cat) {
				output = ((Cat) a).meow();
			}
			System.out.println(a.getName() + " pleier å si " + output);
			// Subcasting kan føre til feil, så være obs!
			// System.out.println(((Dog) a).bark());
			// instanceof Animal vil alltid returnere true
			if (a instanceof Animal) {
				System.out.println(a.getName() + " er et dyr...");
			}
			if (a instanceof Object) {
				System.out.println(a.getName() + " er et objekt...");
			}
		}
		
	}
	
	
}
