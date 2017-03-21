package observable;

import javafx.scene.paint.Color;

public class Beundrer implements IdolFan {

	private Color hairColor;
	
	public Color getHairColor() {
		return hairColor;
	}
	
	public void setHairColor(Color hairColor) {
		this.hairColor = hairColor;
	}

	/* (non-Javadoc)
	 * @see observable.IdolFan#somethingChanged(java.lang.String, observable.Idol)
	 */
	@Override
	public void somethingChanged(String what, Idol idol) {
		if (Idol.HAIR_COLOR.equals(what)) {
			setHairColor(idol.getHairColor());
		}
	}
	
	public static void main(String[] args) {
		Idol idol = new Idol();
		Beundrer beundrer1 = new Beundrer();
		Beundrer beundrer2 = new Beundrer();
		idol.addIdolFan(beundrer1);
		idol.addIdolFan(beundrer2);
		idol.addIdolFan((what, idol2) -> { System.out.println(what);});
		idol.setHairColor(Color.ALICEBLUE);
		System.out.println(beundrer1.getHairColor() + " == " + beundrer2.getHairColor() + "?");

		Idol2 idol2 = new Idol2();
		idol2.addIdolFan((event) -> {
			System.out.println(event.getPropertyName() + " changed from " + event.getOldValue() + " to " + event.getNewValue());
		});
		idol2.setHairColor(Color.ALICEBLUE);
		idol2.setHairLength(2);
	}
}
