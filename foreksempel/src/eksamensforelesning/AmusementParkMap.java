package eksamensforelesning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class AmusementParkMap {
	
	private Collection<Location> locations = new ArrayList<Location>(); 
	
	public void addLocation(Location loc){
		locations.add(loc); 
	}
	public void removeLocation(Location loc){
		locations.remove(loc); 
	}
	
	public Collection<Integer> drawMap(){
		Collection<Integer> numberLocations = new ArrayList(); 
		for(Location loc: locations){
			numberLocations.add(loc.getLocation()); 
		}
		//locations.stream().map((l->l.getLocation())).collect(Collectors.toList()); 
		return numberLocations; 
	}

}
