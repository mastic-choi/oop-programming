
public class PointManager {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		System.out.println(pt1);
		
		Point pt2 = new Point(55);
		System.out.println(pt2);
		
		
		Point pt3; 
		pt3 = pt1;
		System.out.println(pt3);

		pt1.print();
		pt2.print();
		pt3.print();
		
		pt1.setX(777);
		pt1.setY(999);
		
		System.out.println("------------------------");
		pt1.print();
		pt2.print();
		pt3.print();
				
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);
		
		
		
		Point pt4 = new Point( 35.1, 45.7);
		pt4.print();
		
		Point pt5 = new Point(pt4);
		pt5.print();
		
		
		Point[] pointList;
		final int TOTAL = 10;
		pointList = new Point[TOTAL];
		
		for (int i=0; i<pointList.length; i++ ) {
			pointList[i] = new Point(i * 10);
			pointList[i].print();
		}  // for i
		
		
	} // end of main()

} // end of class
