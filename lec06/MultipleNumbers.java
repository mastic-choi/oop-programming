
public class MultipleNumbers {

	public static void main(String[] args) {
		
		
		int sumEven=0;
		int sumSeven=0;
		
		for(int i=10; i<100; i++) {  // 2 digit numbers 
		
			if (i%2 == 0) {      // even number
				System.out.println("  " + i);
				sumEven += i;
			} // if
				
			if (i % 7 ==0)  {   // multiple numbers of 7
				System.out.println("                      " + i);
				sumSeven += i;
			}
			
		} // for i

		System.out.println("Total sum of even numbers : " + sumEven);
		System.out.println("Total sum of multiple numbers  of 7 : " + sumSeven);
		
	} // main()
} // class
