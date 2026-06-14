
public class ShapeManager {

	
	static void rectangleReposition (Rectangle rec) {
		int tmp;
		
		tmp = rec.getWidth();
		rec.setWidth(  rec.getHeight() );
		rec.setHeight(tmp);
	}
	
	
	public static void main(String[] args) {
		
		
		Point pt1 = new Point();
		System.out.println(pt1);
	
		Circle cr1 = new Circle();
		System.out.println(cr1);
		System.out.println(cr1.getArea());		

		
		
		Shape sh1;
		// sh1  = new Shape();              // cannot instantiate
		
		sh1 = cr1;                      // upcasting  
		System.out.println(sh1);
		System.out.println(sh1.getArea());
			
		Shape sh2 = cr1;                // upcasting
		System.out.println(sh2.getArea());	
		
		System.out.println("------------------");
		Rectangle rec1 = new Rectangle();
		System.out.println(rec1);
		
		Rectangle rec2 = new Rectangle(234, 456);
		System.out.println(rec2);
		
		Rectangle rec3 = new Rectangle(pt1, 111, 222);
		System.out.println(rec3);
		
		System.out.println("------------------");
		rec1.relocate();
		System.out.println(rec1);
		
		rectangleReposition(rec2);
		System.out.println(rec2);
		
		
	}  // end of main()

}  // end of class
