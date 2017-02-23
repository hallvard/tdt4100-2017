package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DigitController {

	Digit digit;

	@FXML
	void initialize() {
		digit = new Digit(10);
		updateView();
	}
	
	@FXML
	Text toStringOutput;
		
	void updateView() {
		toStringOutput.setText(digit.toString());
	}
	
	@FXML
	void handleIncrement() {
		digit.increment();
		updateView();
	}
	
	@FXML
	TextField baseInput;
	
	@FXML
	void handleNewDigitBase() {
		digit = new Digit(Integer.valueOf(baseInput.getText()));
		updateView();
	}
}
