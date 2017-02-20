package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LineEditorController {

	LineEditor lineEditor;

	@FXML
	void initialize() {
		lineEditor = new LineEditor();
		updateView();
	}
	
	@FXML
	Text toStringOutput;
	
	void updateView() {
		toStringOutput.setText(lineEditor.toString());
	}
	
	@FXML
	void handleLeft() {
		lineEditor.left();
		updateView();
	}
	
	@FXML
	void handleRight() {
		lineEditor.right();
		updateView();
	}
	
	@FXML
	void handleDeleteLeft() {
		lineEditor.deleteLeft();
		updateView();
	}
	
	@FXML
	void handleDeleteRight() {
		lineEditor.deleteRight();
		updateView();
	}
	
	@FXML
	TextField insertStringStringInput;
	
	@FXML
	void handleInsertString() {
		lineEditor.insertString(insertStringStringInput.getText());
		updateView();
	}
}
