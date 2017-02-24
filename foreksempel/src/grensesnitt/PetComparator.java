package grensesnitt;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet>{

	//Sammenligner to Pets på navn
	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getName().compareTo(o2.getName()); 
	}
	
	
	
}
