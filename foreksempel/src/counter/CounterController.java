package counter;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class CounterController {

	Counter counter;

	@FXML
	Text output;
	
	@FXML
	void initialize() {
		counter = new Counter(3);
	}
	
	@FXML
	void handleTellOppAction() {
		counter.count();
		output.setText("Tellerverdi: " + counter.getCounter());
	}
}
