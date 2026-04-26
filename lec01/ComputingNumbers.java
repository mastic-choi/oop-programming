
public class ComputingNumbers {

	
	
	static int add(int a, int b) {
		return (a + b);
	}
	
	
	static int multiply(int a, int b) {
		return (a * b);
	}
	
	
	public static void main(String[] args) {
		
		// 출력하기
		System.out.println("Hello, This is the OOP class!");
		
		System.out.println("2 + 4 = " + (2+4) ); 
		System.out.println("----------------------------");
		
		int num1 = 2;
		int num2 = 6;
		
		System.out.println("num1 has " + num1);
		System.out.println("num2 has " + num2);
		System.out.println("The add result is      " + add(num1, num2) );
		System.out.println("The multiply result is " + multiply(num1, num2) );
		System.out.println("----------------------------");
		
		num1 = 100;
		num2 = 350;
		System.out.println("num1 has " + num1);
		System.out.println("num2 has " + num2);
		System.out.println("The add result is      " + add(num1, num2) );
		System.out.println("The multiply result is " + multiply(num1, num2) );
		System.out.println("----------------------------");
		
		int result = add(3, 9);
		System.out.println("result is " + result);
		
	} // end of main()
} // end of class
