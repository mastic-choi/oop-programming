import java.util.Scanner;

public class ArrayManager {

	public static int[] makeArray(int size) {
		int[] temp = new int[size];
		return temp;
	} // end of makeArray()
	
	
	public static void fillArray(int[] myArray, int filler) {
		for (int i=0; i<myArray.length; i++ ) {
			myArray[i] = filler;
		}
	} // end of fillArray
	
	
	public static void printArray(int[] tempList) {
		
		System.out.println("the contents of the array ");
		for (int k: tempList) {
			System.out.print("\t " + k);
		} // for each
		System.out.println("\n----end of the array ");
	} // end of printArray
	
	
	public static void doubleArray(int[] tempArray) {
		
		for (int i=0; i<tempArray.length; i++) {
			tempArray[i] = tempArray[i] * 2;
		} // for i
		
	}  // end of doubleArray()
	
	public static int sumArray(int[] tempList) {
		int tempSum =0;
		for(int k : tempList) {
			tempSum += k;
		}
		return tempSum;
	} // end of sumArray
	
	public static void modifyElement(int temp) {
		temp *= 100;
	} // end of modifyElement()
	
	// --------------- main program	------------
	public static void main(String[] args) {
		
		int[] myList;     // an array 
		
		// making an Array
		Scanner input = new Scanner(System.in);
		int numberArray;
		do {
			System.out.println("Enter a positive integer :");
			numberArray = input.nextInt();
		} while(numberArray <= 0);
		
		myList = makeArray( numberArray ); // call by value
		
		// filling numbers 
		int myData = 7;
		fillArray( myList, myData); 	// call by reference and value
		
		// printing the array
		printArray( myList);			// call by reference 
		
		// doubling array 
		doubleArray(myList);           	// call by reference 
		printArray( myList);     		// call by reference 
		
		// sum the array contents
		int sum = sumArray(myList);		 // call by reference 
		System.out.println("Total sum is : " + sum);
		
		// modify a content
		System.out.println("before=======");
		printArray( myList);
		modifyElement(myList[1]);        // call by value
		System.out.println("after =======");
		printArray( myList);
		
		
		// 2D 
		
		int[][] myGrid;
		
		myGrid = new int[5][];
		
		for (int i=0; i<myGrid.length; i++) {
			myGrid[i] = makeArray(i+5);
			fillArray( myGrid[i], i); 
		} 
		
		for (int i=0; i<myGrid.length; i++) {
			for (int j=0; j<myGrid[i].length; j++) {
				System.out.print(myGrid[i][j]);
			}  // for j
			System.out.println();
		} // for i		
		
	} // end of main()

} // end of class
