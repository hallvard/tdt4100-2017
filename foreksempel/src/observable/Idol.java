package observable;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;

public class Idol {

	public static final String HAIR_COLOR = "hairColor";

	private Color hairColor;
	
	public Color getHairColor() {
		return hairColor;
	}
	
	public void setHairColor(Color hairColor) {
		this.hairColor = hairColor;
		firePropertyChange(HAIR_COLOR);
	}

	private void firePropertyChange(String what) {
		for (IdolFan idolFan : idolFans) {
			idolFan.somethingChanged(what, this);
		}
	}
	
	private List<IdolFan> idolFans = new ArrayList<IdolFan>();
	
	public void addIdolFan(IdolFan idolFan) {
		this.idolFans.add(idolFan);
	}
}
