
public class Rectangle extends Shape {

	private int height;
	private int width;
	
	
	// Constrcutors
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public Rectangle(Point pos, int height, int width) {
		super(pos);
		this.height = height;
		this.width = width;
	}
	
	
	public Rectangle() {
		this(new Point(), 555, 666);
	}


	// overriding 
	public double getArea() {
		return (height * width);
	}

	public void relocate() {
		int tmp = width;
		width = height;
		height = tmp;
	}
	
    // getter and setter	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]  with  " + super.toString();
	}
	
} // end of class
