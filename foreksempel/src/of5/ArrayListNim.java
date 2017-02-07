package of5;

import java.util.ArrayList;

public class ArrayListNim {

	private ArrayList<Pile> piles;
	
	public ArrayListNim() {
		this(10, 3);
	}

//	Nytt. Tredje konstruktør.
//	Poengtér at denne trengs grunnet FXen (krever 3 piles)
//	Utfordring: Utvide FXen med x antall piles
	public ArrayListNim(int pileSize) {
		this(pileSize, 3);
	}	
	
	public ArrayListNim(int pileSize, int numberOfPiles) {
		piles = new ArrayList<Pile>(numberOfPiles);
		for (int i = 0; i < numberOfPiles; i++) {
			piles.add(new Pile(pileSize));
		}
	}
		
	@Override
	public String toString() {
		return "Nim [piles=" + piles + "]";
	}

	public void removePieces(int number, int targetPile) {
		if (isGameOver()) {
			throw new IllegalStateException("Kan ikke fjerne brikker " + 
					"når spillet allerede er slutt.");
		}
		piles.get(targetPile).removePieces(number);
	}

	public boolean isValidMove(int number, int targetPile) {
		return piles.get(targetPile).isValidMove(number);
	}

	public boolean isGameOver() {
//		Spillet kun over når alle piles er tomme
//		Ny løkke-construct, kommentér
		for (Pile pile : piles) {
			if (pile.getNumber() > 0) {
				return false;
			}
		}
		return true;
	}

//	Nøkkelspm.: Finnes det intern innkapsling?
//	Høyreklikk metode -> Open Call Hierarchy
	public int getPileCount(int targetPile) {
		return piles.get(targetPile).getNumber();
	}
	
/*
 * Quick testing of the ArrayListNim
 */
	public static void main(String[] args) {
		ArrayListNim nim = new ArrayListNim();
		System.out.println(nim.piles.get(0).getNumber());
	}
}