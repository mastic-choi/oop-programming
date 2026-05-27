
public class 1-Point {
	private int x;
	private int y;
	
	
	public Point() {   // Constructor 
		x = 1;
		y = 1;
	}

	public Point(int x, int y) {   // Constructor 
		this.x = x;
		this.y = y;
	}
	
	public Point(int z) {   // Constructor 
		this.x = z;
		this.y = z;
	}
	
	public String toString() {
		return(" (x, y) = ( " + x + " , " + y + " )" );
	}
	
	
	// getter & setter methods
	
	void setX(int a ) {
		x = a;
	}
	
	int getX() {
		return x;
	}
  	
	void setY(int b) {
		y = b;
	}
	
	int getY() {
		return y;
	}
} // end of Point


