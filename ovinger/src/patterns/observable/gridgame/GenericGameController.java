package patterns.observable.gridgame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class GenericGameController implements GridListener<Character> {
	
	@FXML TextArea console; 
	
	@FXML TextField inputField;
	@FXML TextField fileName;
	
	private GenericGridGame<Character> game; 
	
	public void initialize() {
		//Her maa du opprette et objekt av spillet ditt med de argumentene som behoves for det - resten av koden vil gaa ut ifra at du har kalt den game
		game = new TicTacToe(); 
		game.addGridListener(this);
		update();
	}
	
	private void update() {
		console.setText(game.toString());
		undoButton.setDisable(! game.canUndo());
		redoButton.setDisable(! game.canRedo());
		updateGrid(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	
	@FXML
	public void sendInput() {
		String in = inputField.getText(); 
		game.getInput(in); 
		update();
	}
	
	@FXML Button undoButton;
	@FXML Button redoButton;
	
	@FXML
	public void undo() {
		game.undo();
		update();
	}
	
	@FXML
	public void redo() {
		game.redo();
		update();
	}
	
	@FXML
	public void save() throws IOException {
		game.save(fileName.getText());
		update();
	}
	
	@FXML
	public void load() throws IOException {
		game.load(fileName.getText());
		update();
	}
	
	@FXML GridPane gameGrid;
	
	private Map<String, Image> images = new HashMap<String, Image>();
	
	private Image getImage(String imageDescription) {
		Image image = images.get(imageDescription);
		if (image == null) {
			int pos = imageDescription.lastIndexOf('.');
			if (pos > 0) {
				// path to image
				String urlString = game.getClass().getResource(imageDescription).toString();
				image = new Image(urlString);
			} else {
				// text to draw into image
				image = createImageFromDescription(imageDescription);
			}
			if (image != null) {
				images.put(imageDescription, image);
			}
		}
		return image;
	}

	private Image createImageFromDescription(String imageDescription) {
		String s = null, at = null, size = null;
		int atPos = imageDescription.indexOf('@'), sizePos = imageDescription.indexOf('#');
		if (atPos > 0) {
			s = imageDescription.substring(0, atPos);
			at = imageDescription.substring(atPos + 1, (sizePos < 0 ? imageDescription.length() : sizePos));
		}
		if (sizePos > 0) {
			if (s == null) {
				s = imageDescription.substring((atPos > 0 ? atPos : 0), sizePos);
			}
			size = imageDescription.substring(sizePos + 1);
		}
		if (s == null) {
			s = imageDescription;
		}
		double w = 50.0, h = 50.0;
		if (size != null) {
			String[] wh = size.split(",");
			w = Double.valueOf(wh[0]);
			h = Double.valueOf(wh[1]);
		}
		Text text = new Text(s);
		text.setFont(Font.font(48));
		Bounds bounds = text.getBoundsInLocal();
		double scaleX = w / bounds.getWidth(), scaleY = h / bounds.getHeight();
		double scaling = Math.min(scaleX, scaleY);
		text.setScaleX(scaling);
		text.setScaleY(scaling);

		double x = 0.0, y = 0.0;
		if (at != null) {
			String[] xy = at.split(",");
			x = Double.valueOf(xy[0]);
			y = Double.valueOf(xy[1]);
		} else {
			x = (w - bounds.getWidth() * text.getScaleX()) / 2;
			y = (h - bounds.getHeight() * text.getScaleY()) / 2;
		}
		AnchorPane pane = new AnchorPane();
		text.setLayoutX(x);
		text.setLayoutY(y);
		pane.getChildren().add(text);
		WritableImage snapshot = new WritableImage((int) w, (int) h);
		SnapshotParameters params = new SnapshotParameters();
		pane.snapshot(params, snapshot);
		return snapshot;
	}

	private void removeGridImages(int col, int row, int width, int height) {
		Collection<Node> childrenToRemove = new ArrayList<>();
		for (Node child : gameGrid.getChildren()) {
			int childColumn = GridPane.getColumnIndex(child), childRow = GridPane.getRowIndex(child);
			if (childColumn >= col && childColumn < col + width && childRow >= row && childRow < row + height) {
				
			}
		}
		gameGrid.getChildren().removeAll(childrenToRemove);
	}
	
	private void addGridImages(int col, int row, int width, int height) {
		for (int y = row; y < row + width && y < game.getRowCount(); y++) {
			for (int x = col; x < col + width && x < game.getColumnCount(); x++) {
				Character c = game.getCell(x, y);
				String[] imageNames = game.getImages(c);
				ImageView[] imageViews = new ImageView[imageNames.length];
				for (int imageNum = imageNames.length - 1; imageNum >= 0; imageNum--) {
					Image image = getImage(imageNames[imageNum]);
					ImageView imageView = new ImageView(image);
					imageViews[imageNum] = imageView;
				}
				Node node = null;
				if (imageViews.length == 1) {
					node = imageViews[0];
				} else {
					node = new StackPane(imageViews);
				}
				gameGrid.getChildren().add(node);
				GridPane.setRowIndex(node, y);
				GridPane.setColumnIndex(node, x);
			}
		}
	}

	private void updateGrid(int col, int row, int width, int height) {
		removeGridImages(col, row, width, height);
		addGridImages(col, row, width, height);
	}
	
	//
	
	@Override
	public void gridChanged(GenericGridGame<Character> gridGame, int col, int row, int width, int height) {
		updateGrid(col, row, width, height);
	}
}
