
import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int score;
		int sum = 0;
		int count = 0 ;
		
		do {
			System.out.println("Enter an integer number for score : (-1 for exit) ");
			score = myInput.nextInt();
			sum += score;
			count++;
			
			System.out.println("--------------------- "  + score);
		} while ( score != -1);
		
		System.out.println("Total sum is " + sum);
		System.out.println("Average is " + (double) sum / count);
		
	}  // end of main()

} // end of class
