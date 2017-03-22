package of11;

import java.util.ArrayList;
import java.util.List;

public class SimpleClient implements Client {

	String name;
	List<Mail> inbox;
	
	public SimpleClient(String name) {
		this.name = name;
		this.inbox = new ArrayList<>();
	}
	
	@Override
	public void newMail(Mail mail) {
		if (inbox.size() < 5) {
			inbox.add(mail);
		} else {
			System.out.println("Har ikke plass til flere e-poster i innboksen.");
		}
		
	}

	@Override
	public List<Mail> getInbox() {
		return inbox;
	}

	@Override
	public String mailToString(int index) {
		if (index >= 0 && index < inbox.size()) {
			Mail mail = inbox.get(index);
			return "SimpleClient " + name + "\n" + mail;
		} return "Ugyldig indeks.";
	}

	
	
}
