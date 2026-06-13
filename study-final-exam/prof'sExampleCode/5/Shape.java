
public class Shape {

	private Point position;

	
	// constructors
	public Shape() {
		this(new Point(77,99));
	}

	public Shape(Point position) {
		this.position = position;
	}

	// getArea()
	
	public double getArea() {
		return(0.0);
	}
	
	
	// getter and setter 
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Shape [position=" + position + "]";
	}
	
}  // end of class
