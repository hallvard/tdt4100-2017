package observable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javafx.scene.paint.Color;

public class Idol2 {

	public static final String HAIR_COLOR = "hairColor";

	private Color hairColor;
	
	public Color getHairColor() {
		return hairColor;
	}
	
	public void setHairColor(Color hairColor) {
		Color oldColor = this.hairColor;
		this.hairColor = hairColor;
		pcs.firePropertyChange(HAIR_COLOR, oldColor, this.hairColor);
	}
	
	private int hairLength = 30;
	
	public static final String HAIR_LENGTH = "hairLength";

	public int getHairLength() {
		return hairLength;
	}
	
	public void setHairLength(int hairLength) {
		int oldLength = this.hairLength;
		this.hairLength = hairLength;
		pcs.firePropertyChange(HAIR_LENGTH, oldLength, this.hairLength);
	}

	private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	public void addIdolFan(PropertyChangeListener pcl) {
		this.pcs.addPropertyChangeListener(pcl);
	}
}
