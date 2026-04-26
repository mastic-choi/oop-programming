import java.util.Scanner;

public class TestInputs {

	public static int sum(int a, int b) {
		return (a + b);
	}
	
	public static int mul(int a, int b) {
		return (a * b);
	}
	
	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);

		int num1;
		int num2;
		
		System.out.println("Enter two integer numbers : ");
		num1 = myInput.nextInt();
		num2 = myInput.nextInt();
		
		System.out.println("\tThe first is " + num1 + " ,  \n\t**  the second is " + num2 );
		
		System.out.println("The Addition is " + sum(num1, num2)  );
		System.out.println("The Multiplication is " + mul(num1, num2) );
		
		
		System.out.printf("%nThe first integer  ( %d ) and  the second integer ( %d ) %n",
	                       num1, num2 );
		
		myInput.close();
		
	} // end of main()

} // end of class
