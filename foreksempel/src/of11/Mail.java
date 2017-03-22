package of11;

public class Mail {

	private String sender, recipient, title, text;
	
	public Mail(String sender, String recipient,
			String title, String text) {
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Sender: " + sender + "\nRecipient: " + recipient +
				"\nTitle: " + title + "\n" + text;
	}
	
	public static void main(String[] args) {
		Mail mail = new Mail("hal@idi.ntnu.no", "kundeservice@telenor.no",
				"Kommer ikke på nettet", "Nå vet virkelig ikke hva jeg skal gjøre...");
		System.out.println(mail);
	}
	
}
