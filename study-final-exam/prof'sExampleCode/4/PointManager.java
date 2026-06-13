
public class PointManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int TOTAL = 10;
		
		Point[] pointList = new Point[TOTAL];
		
		for (int i=0; i<pointList.length; i++) {
			pointList[i] = new Point(i, i);
	
			System.out.println( pointList[i] );
		}  // for i
		
		Point pt1 = new Point();
		Point pt2 = new Point(pt1);
		
		System.out.println(pt1.TotalNumberPoint);
		System.out.println(Point.TotalNumberPoint);
		
	} // end of main()

} // end of class
