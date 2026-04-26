import java.util.Scanner;

public class ComputeNumbers {
	
	
	static int add(int a, int b) {  // parameters
		return a + b;
	}
	
	static int sub(int a, int b) {  // parameters
		return a - b;
	}
	
	static int mul(int a, int b) {  // parameters
		return a * b;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("addion        :  ADD,  enter two integers. ");
		System.out.println("subtaction    :  SUB,  enter two integers. ");
		System.out.println("multiplication:  MUL,  enter two integers. ");
		System.out.print(">> ");
		
		String order = input.next();
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int finalNumber = 0;
		
		switch(order) {
			case "ADD":
				finalNumber = add(num1, num2);   // arguments
				break;
				
			case "SUB":
				finalNumber = sub(num1, num2);   // arguments
				break;				

			case "MUL":
				finalNumber = mul(num1, num2);   // arguments
				break;		
				
			default :
				System.out.println("Error Code!");
						
		}  // end of switch
		
		System.out.println("The result is  " + finalNumber);
		
	}  // end of main()

} // end of class
