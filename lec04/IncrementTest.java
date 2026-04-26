
public class IncrementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aaa = 5;
		int bbb;
		
		System.out.println("aaa = " + aaa);
		System.out.println("------  prefix increment --------");
		
		bbb = ++aaa;
		
		System.out.println("aaa = " + aaa);
		System.out.println("bbb = " + bbb);

		
		System.out.println("------  postfix increment --------");
		
		aaa = 5;
		bbb = aaa++;
		
		System.out.println("aaa = " + aaa);
		System.out.println("bbb = " + bbb);
		

		System.out.println("------  increment test --------");
		
		aaa = 10;
		
		System.out.println("aaa = " + aaa++);
		System.out.println("aaa = " + aaa);
		
		
		aaa++;
		System.out.println("aaa = " + aaa);		

		++aaa;
		System.out.println("aaa = " + aaa);		
		
		
	}  // end of main()

} // end of class
