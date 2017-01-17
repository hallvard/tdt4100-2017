package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class LocationController {

	Location location;

	@FXML
	void initialize() {
		location = new Location();
		updateView();
	}
	
	@FXML
	Text toStringOutput;
	
	@FXML
	Line line1;

	@FXML
	Line line2;
	
	void updateView() {
		toStringOutput.setText(location.toString());
		line1.setLayoutX(location.x);
		line1.setLayoutY(location.y);
		line2.setLayoutX(location.x);
		line2.setLayoutY(location.y);
	}
	
	@FXML
	void handleLeft() {
		location.left();
		updateView();
	}
	
	@FXML
	void handleRight() {
		location.right();
		updateView();
	}
	
	@FXML
	void handleUp() {
		location.up();
		updateView();
	}
	
	@FXML
	void handleDown() {
		location.down();
		updateView();
	}
	
	@FXML
	TextField xInput;

	@FXML
	TextField yInput;
	
	@FXML
	void handleMoveXY() {
		location.move(Integer.valueOf(xInput.getText()), Integer.valueOf(yInput.getText()));
		updateView();
	}
}
