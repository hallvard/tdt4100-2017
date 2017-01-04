package counter;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class DownCounterController {

	DownCounter downCounter;
	
	@FXML
	private Text isFinishedOutput;

	@FXML
	void initialize() {
		downCounter = new DownCounter(3);
		isFinishedOutput.setText("Ferdig: " + downCounter.isFinished());
	}

	// Event Listener on Button.onAction
	@FXML
	public void handleCountDownAction() {
		downCounter.countDown();
		isFinishedOutput.setText("Ferdig: " + downCounter.isFinished());
	}
}
