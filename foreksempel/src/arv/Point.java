package arv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Point {

	private final double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Point other = (Point) obj;
		return this.x == other.x && this.y == other.y;
	}
	
	// til testing
	public static void main(String[] args) {
		Collection<Point> points = new ArrayList<Point>();
		Point p1 = new Point(5.0, 10.0), p2 = new Point(15.0, 10.0), p3 = new Point(5.0, 15.0);
		points.addAll(Arrays.asList(p1, p2, p3));

		System.out.println(p1.equals("fdjkl"));
		
		Point p4 = new Point(15.0, 10.0), p5 = new Point(42.0, 1.0);
//		System.out.println(points.contains(p1));
//		System.out.println(points.contains(p5));
		System.out.println(points.contains(p4));

		System.out.println(points.equals(Arrays.asList(p1, p4, p3)));
	}
}
