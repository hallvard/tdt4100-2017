package examples;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FxmlCounter2 {

	Counter counter;

	@FXML
	Label counterLabel;
	
	@FXML
	void initialize() {
		counter = new Counter(5);
	}
	
	void updateCounterLabel() {
		counterLabel.setText("Current counter value: " + counter.getCounter());
	}
	
	@FXML
	void handleCountAction() {
		counter.count();
		updateCounterLabel();
	}
}
