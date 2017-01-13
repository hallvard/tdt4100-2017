package average;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AverageController {
	
	Average average;
	
	@FXML
	void initialize() {
		average = new Average();
	}

	@FXML
	Label averageOutput;
	@FXML TextField acceptValueInput;

	@FXML
	public void handleAcceptValue() {
		String acceptValueString = acceptValueInput.getText();
		double v = Double.valueOf(acceptValueString);
		average.acceptValue(v);
		String s = String.valueOf(average.getAverage());
		averageOutput.setText(s);
	}	
}
