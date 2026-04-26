
public class ComputeShape {

	final static double PI = 3.14;   // 상수 
	
	public static double computeArea(double r) {  // parameter 
		 return (r * r * PI);	
	} // end of computeArea()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		double radius;
		double area;
		
		radius = 23.4;
		
		area = computeArea(radius);
		
		System.out.println("The area is " + area);
		
	}  // end of main()

} // end of class
