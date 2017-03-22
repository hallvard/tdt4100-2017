package of11;

import java.util.List;

public interface Client extends ServerListener{

	/*
	 * Client "arver" fra ServerListener 
	 */
	
	List<Mail> getInbox();
	String mailToString(int index);
	
}
