package of11;

public class ServerProgram {
	
	public static void main(String[] args) {
		Server server = new Server();
		// Legge til lyttere/observatører
		for (int i = 0; i < 5; i++) {
			ServerListener listener =
					new SimpleClient("" + i);
			server.addListener(listener);
		}
		
		// Lag en e-post
		Mail mail = new Mail("gunnar.bovim@ntnu.no",
				"kundeservice@telenor.no",
				"Veldig fornøyd!",
				"Internettet mitt fungerer utmerket.");
		
		// "Sende inn" eposten til kundeservice-Server
		server.newMail(mail);
		
		//Løkke over observatørene, sjekke tilstand
		for (ServerListener listener : server.listeners) {
			String mailString = ((SimpleClient) listener).mailToString(0);
			System.out.println(mailString);
		}
	}
}
