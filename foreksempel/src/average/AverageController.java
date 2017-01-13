package average;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AverageController {
	
	// referanse til et Average-objekt
	Average average;
	
	// kalles etter at FXML-mekanismen har laget alle JavaFX-objektene og
	// koblet JavaFX-objekter med fx:id-er med tilsvarende attributter
	// @FXML angir at metoden er ment å bli kalt av FXML-mekanismen
	@FXML
	void initialize() {
		// sett average-variablen til et nytt Average-objekt
		average = new Average();
	}

	// referanse til et Label-objekt, som er et JavaFX-objekt for tekst-output
	// @FXML angir at attributtet er ment å bli satt av FXML-mekanismen
	@FXML
	Label averageOutput;
	// referanse til et TextField-objekt, som er et JavaFX-objekt for tekst-input
	// @FXML angir at attributtet er ment å bli satt av FXML-mekanismen
	@FXML
	TextField acceptValueInput;

	// metode som kalles når acceptValue-knappen trykkes
	// 
	@FXML
	public void handleAcceptValue() {
		// hent teksten (en String) ut av tekstfeltet
		String acceptValueString = acceptValueInput.getText();
		// konverter teksten til et desimaltall
		double value = Double.valueOf(acceptValueString);
		// gi desimaltallet til Average-objektet
		average.acceptValue(value);
		// be om gjennomsnittet og konverter til tekst (en String)
		String s = String.valueOf(average.getAverage());
		// oppdater Label-objektet
		averageOutput.setText(s);
	}	
}
