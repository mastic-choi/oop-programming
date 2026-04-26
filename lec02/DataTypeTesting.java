
//  This is the programming task on March 18th.

public class DataTypeTesting {

	public static void main(String[] args) {
		
		// define the data types for variables  변수 정의
		int myInt;  
		short myShort;
		byte myByte;
		double myDouble;
		boolean myBoolean;
		char myChar;
		
		
		// use the variable 변수 활용
		myInt = 100;
		myShort = 200;
		myByte = 30;
		myDouble = 234.34543;
		myBoolean = true;      // true  혹은 false 값을 할당합니다.
		myChar = 'a';
		
		
		System.out.println("int : " + myInt);
		System.out.println("short : " + myShort);
		System.out.println("byte : " + myByte);
		System.out.println("double : " + myDouble);
		System.out.println("boolean : " + myBoolean);
		System.out.println("char : " + myChar);
		
		// the maximum value
		
		System.out.println("the max value of int : " + Integer.MAX_VALUE ); 
		System.out.println("the max value of short : " + Short.MAX_VALUE ); 
		System.out.println("the max value of byte : " + Byte.MAX_VALUE ); 
		System.out.println("the max value of double : " + Double.MAX_VALUE ); 
		
		System.out.println("the min value of int : " + Integer.MIN_VALUE ); 
		System.out.println("the min value of short : " + Short.MIN_VALUE ); 
		System.out.println("the min value of byte : " + Byte.MIN_VALUE ); 
		System.out.println("the min value of double : " + Double.MIN_VALUE );
		
	}  // end of main()
} // end of class
