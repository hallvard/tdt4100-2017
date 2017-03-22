package of11;

import java.util.ArrayList;
import java.util.List; // Ikke java.awt.List

public class Server {

	// Den observerte klassen.
	List<ServerListener> listeners = new ArrayList<>();
	
	// Metoder for å legge til og fjerne lyttere
	public void addListener(ServerListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void removeListener(ServerListener listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
	
	public void newMail(Mail mail) {
		for (ServerListener listener : listeners) {
			listener.newMail(mail);
		}
	}
	
}
