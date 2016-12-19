package examples;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FxmlCounter1 {

	/**
	 * The upper limit (inclusive) for the counter).
	 */
	int end;
	
	/**
	 * The counter, with initial value.
	 */
	int counter = 0;

	void count() {
		if (counter < end) {
			counter = counter + 1;
		}
	}

	@FXML
	Label counterLabel;
	
	@FXML
	void initialize() {
		end = 5;
	}

	void updateCounterLabel() {
		counterLabel.setText("Current counter value: " + counter);
	}
	
	@FXML
	void handleCountAction() {
		count();
		updateCounterLabel();
	}
}
