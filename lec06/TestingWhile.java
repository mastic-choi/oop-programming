
public class TestingWhile {

	public static void main(String[] args) {

		int count = 0;
		int sum = 0;
		
		while( count < 10) {
			sum += count;
			System.out.println(count  + "  =>  " + sum  );
			count++;
		}  // while
		
	} // end of main()

} // end of class
