package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RectangleController {

	Rectangle rect1, rect2;

	@FXML
	void initialize() {
		rect1 = new Rectangle();
		rect2 = new Rectangle();
		updateView();
	}
	
	@FXML Text toStringOutput1;
	@FXML Text toStringOutput2;
	
	@FXML javafx.scene.shape.Rectangle fxRect1;
	@FXML javafx.scene.shape.Rectangle fxRect2;

	@FXML Text toStringUnionOutput;
	@FXML Text toStringIntersectionOutput;
	
	@FXML javafx.scene.shape.Rectangle fxUnionRect;
	@FXML javafx.scene.shape.Rectangle fxIntersectionRect;

	void updateView() {
		toStringOutput1.setText(rect1.toString());
		toStringOutput2.setText(rect2.toString());
		updateRectangle(rect1, toStringOutput1, fxRect1);
		updateRectangle(rect2, toStringOutput2, fxRect2);
		updateRectangle(rect1.union(new Rectangle()).union(rect2), toStringUnionOutput, fxUnionRect);
		//Dersom du gjor ekstraoppgaven kan du fjerne kommentaren fra denne linja
		//updateRectangle(rect1.union(new Rectangle()).intersection(rect2), toStringIntersectionOutput, fxIntersectionRect);
	}
	
	void updateRectangle(Rectangle rect, Text toStringOutput, javafx.scene.shape.Rectangle fxRect) {
		if (toStringOutput != null) {
			toStringOutput.setText(rect.toString());
		}
		if (fxRect != null) {
			fxRect.setLayoutX(0);
			fxRect.setLayoutY(0);
			fxRect.setX(rect.getMinX());
			fxRect.setY(rect.getMinY());
			fxRect.setWidth(rect.getWidth());
			fxRect.setHeight(rect.getHeight());
		}
	}
	
	@FXML TextField xInput1;	
	@FXML TextField yInput1;

	@FXML
	void handleAddXY1() {
		rect1.add(Integer.valueOf(xInput1.getText()), Integer.valueOf(yInput1.getText()));
		updateView();
	}
	
	@FXML TextField xInput2;
	@FXML TextField yInput2;
	
	@FXML
	void handleAddXY2() {
		rect2.add(Integer.valueOf(xInput2.getText()), Integer.valueOf(yInput2.getText()));
		updateView();
	}
	
	@FXML
	void handleAddRect() {
		rect1.add(rect2);
		updateView();
	}
}
