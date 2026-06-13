
public class Point {

	private int x;
	private int y;
	
	// constructors
	public Point() {
		this(100, 100);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this(x, x);
	}

	// getter and setter 
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	// toString()
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
	
} // end of class
