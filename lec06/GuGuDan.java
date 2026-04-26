
public class GuGuDan {

	public static void main(String[] args) {
		
		
	int dan=2;
		
	for (dan=2; dan<=20; dan++ ) {
		
		System.out.println("*" + dan + " dan ");
		for(int col=1;  col<=10; col++ ) {
			
			System.out.print("\t" + dan + " * " + col + " = " + dan*col );
			
			if( col %5 == 0) {
				System.out.println();
			}  //if	
			
		}  // for col
		System.out.println("");
		
	} // for dan
		
		
	} // end of main()

} // end of class
