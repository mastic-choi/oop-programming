
public class ForLoopTest {

	public static void main(String[] args) {
	
		int i;
		int sum = 0;
		
		for (i=0; i<10; i++) {
			
			System.out.println(i);
			sum += i;          // sum = sum + i 
			
		}  // for i
		
		System.out.println("After loop  " +  i);
		System.out.println("Total sum  " +  sum);
		
		
		//multiple numbers 

		sum = 0;
		for (i=0; i<50; i+=7) {
			
			System.out.println(i);
			sum += i;          // sum = sum + i 
			
		}  // for i
		System.out.println("After loop  " +  i);
		System.out.println("Total sum  " +  sum);
		
	} // end of main()

} // end of class
