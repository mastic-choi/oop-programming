import java.util.Scanner;

public class CaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Enter an integer number : ");
		
		int num1 = myInput.nextInt();
		
		if (num1 % 3 == 0) {
			System.out.println("multiple number of 3");
		}
		else if (num1 % 3 == 1){
			System.out.println("multiple number of 3 plus 1");
		}
		else {
			System.out.println("multiple number of 3 plus 2");
		}
			
		//  test a score 
		
		System.out.print("\n\n\nEnter an integer number of score:" );
		int num2 = myInput.nextInt();
		
		if (num2 >= 60) { 
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
			System.out.println("Cheer up!");
		}
		
	}  // end of main()

} // end of class
