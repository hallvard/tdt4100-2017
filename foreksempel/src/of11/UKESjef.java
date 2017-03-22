package of11;

import java.util.ArrayList;
import java.util.List;

public class UKESjef implements Student{

	List<UKEFunk> delegates = new ArrayList<>();
	private List<String> roles;
	
	public UKESjef() {
		roles = new ArrayList<>();
		roles.add("Artist");
		roles.add("Skuespiller");
		roles.add("UKA-TV");
	}
	
	
	@Override
	public void work() {
		String role = roles.get((int) (Math.random()*roles.size()));
		for (UKEFunk funk : delegates) {
			if (funk.getRole().equals(role)) { //Tilfellebasert deleg.
				funk.work();
			}
		}
	}
	
	// Metoder for å legge til og fjerne
	// delegater
	public void addUKEFunk(UKEFunk funk) {
		if (!delegates.contains(funk)) {
			funk.setUKESjef(this);
			delegates.add(funk);
		}
	}
	
	public void removeUKEFunk(UKEFunk funk) {
		if (delegates.contains(funk)) {
			funk.setUKESjef(null); //Fjern sjefen
			delegates.remove(funk);
		}
	}
	
	
	
	
}
