package counter;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * @startuml
 * object DownCounter {
 * 	counter = 3
 * }
 * object DownCounterController {
 * 	counter = 3
 * 	handleCountDownAction()
 * }
 * object Text {
 * 	text = "Ferdig: false"
 * }
 * object Button
 * DownCounterController -l> DownCounter: downCounter
 * DownCounterController -r> Text: isFinishedOutput
 * Button -l> DownCounterController: onAction=handleCountDownAction
 * @enduml
 * 
 * @author hal
 *
 */
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
