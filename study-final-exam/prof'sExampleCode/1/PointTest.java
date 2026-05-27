
public class 1-PointTest {

	public static void main(String[] args) {
		
		Point p = new Point(10, 20);
		System.out.println(p);
		// p.x = 10;
		// p.y = 20;
		System.out.println(p.toString() );
		
		
		Point q = new Point(222, 333);
		// q.x = 222;
		// q.y = 333;
		System.out.println(q);
		
		Point r;
		r = q;
		System.out.println(r);
		
		Point s = new Point();
		System.out.println(s);
		
		
		Point t = new Point(777);
		System.out.println(t);
		// t.x = 999;
		t.setX(999);
		System.out.println(t);
		
		
	}  // end of main()

} // end of class
