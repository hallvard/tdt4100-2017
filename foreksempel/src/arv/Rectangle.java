package arv;

// NB: Dette er konseptuelt feil bruk av arv,
// siden et rektangel ikke ER et punkt.
// Det er riktigere å si at det HAR punkt-informasjon, og
// derfor kunne en i stedet hatt et Point-felt.
// Av samme grunn ville aldri en Person-klasse,
// med behov for å lagre en liste med barn,
// arvet fra ArrayList<Person>.
// En person ER jo ikke en personliste, den HAR en personliste.

public class Rectangle extends Point {
	
	private final double width, height;

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width, double height) {
		this(0, 0, width, height);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (getX() != other.getX() || getY() != other.getY()) {
			return false;
		}
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	
	
}
