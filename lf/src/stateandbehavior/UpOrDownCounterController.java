package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
public class UpOrDownCounterController {

	UpOrDownCounter counter;
	
	@FXML
	private Text isFinishedOutput;
	@FXML 
	private TextField startValue ; 
	
	@FXML 
	private TextField endValue ; 
	
	@FXML
	private Label counterValue; 

	@FXML 
	void initialize(){
		
	}
	
	@FXML
	void handleCreateAction() {
		
		counter = new UpOrDownCounter(this.getIntFromTextField(startValue), this.getIntFromTextField(endValue));
		counterValue.setText(Integer.toString(counter.getCounter()));
		isFinishedOutput.setText("Ferdig: false" );
	}

	// Event Listener on Button.onAction
	@FXML
	public void handleCountAction() {
		boolean done = counter.count();
		isFinishedOutput.setText("Ferdig: " + !done);
		counterValue.setText(Integer.toString(counter.getCounter()));
	}
	
	private int getIntFromTextField(TextField textField) {
		return Integer.parseInt((textField.getText()));
	}
}
