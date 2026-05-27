
public class Circle {

	double radius;
	Point center;
	
	final double PI = 3.14; 
	
	public Circle() {
		radius = 1.0;
		center = new Point(55, 66);
	}

	public Circle(double r, Point c) {
		radius = r;
		center = c;
	}
	
	public String toString() {
		return("radius " + radius + " at " + center);
	}
	
	
	public double getArea() {
		return radius * radius * PI;
	}
	
}  // end of Circle
