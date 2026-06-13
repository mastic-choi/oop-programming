
public class Point {

	private int x;
	private int y;
	
	//static member
	static int TotalNumberPoint = 0;
	
	// Constructors
	public Point() {
		this(1, 1);
	}
	
	public Point(Point pt) {
		this(pt.getX(), pt.getY());
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		TotalNumberPoint++;
	}
	
	
	// getter & setter 
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	//toString()
	
	public String toString() {
		return(" (x, y) = ( " + x + " , " + y + " )");
	}
	
}  // end of class
