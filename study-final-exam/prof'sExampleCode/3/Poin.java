
public class Point {

	private int x;    // private is accessible within the class 
	private int y;
	
	// Constructor
	public Point(int a, int b) {    // full-argument  constructor
		x = a;			
		y = b;
	}  

	public Point(double x, double y) {    // full-argument  constructor
		this.x = (int) x;			
		this.y = (int) y;
	}  
	
	public Point() {        // no-argument  constructor
		this( 1, 1);        
	}
	
	public Point(int x) {       
		this( x, x);        
	}	
	
	public Point(Point temp) {
		this(temp.getX(), temp.getY());
	}
	
	
	// member methods
	public void print() {
		System.out.println(" ( x, y ) = ( " + x + " , " + y + " )");
	}
	
	public void setX(int a) {
		this.x = a;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
} // end of Point
