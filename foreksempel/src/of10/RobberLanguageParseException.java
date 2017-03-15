package of10;


public class RobberLanguageParseException 
	extends IllegalArgumentException {

	char illegalCharacter;
	
	public RobberLanguageParseException(String message,
			char illegalCharacter) {
		// Kall til superkonstruktør
		super(message);
		System.err.println("Kan ikke lage røverspråk med " + 
				illegalCharacter);
		this.illegalCharacter = illegalCharacter;
	}
	
	public char getIllegalCharacter() {
		return illegalCharacter;
	}
	
	
}
