package of11;

public class UKEProgram {

	public static void main(String[] args) {
		UKESjef sjef = new UKESjef();
		// Oppretter UKEFunker først
		UKEFunk kari = new UKEFunk("Kari", "Artist", null);
		UKEFunk ola = new UKEFunk("Ola", "Skuespiller", null);
		UKEFunk hallvard = new UKEFunk("Hallvard", 
				"UKA-TV", null);
		// Legge til funksjonærene i delegatlisten til sjef
		sjef.addUKEFunk(kari);
		sjef.addUKEFunk(ola);
		sjef.addUKEFunk(hallvard);
		// Lag et UKA-arrangement
		sjef.work();
	}
	
}
