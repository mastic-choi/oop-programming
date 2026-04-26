
import java.util.Scanner;

public class MultipleNumber {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);

		System.out.println("Enter two integer numbers ");
		
		int num1 = myInput.nextInt();
		int num2 = myInput.nextInt();
		
		System.out.printf(" num1(%d) %% num2(%d) is %d", num1, num2, num1%num2);
		
	}

}
