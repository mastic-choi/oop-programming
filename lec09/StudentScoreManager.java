import java.util.Scanner;

public class StudentScoreManager {

	
	
	public static double printScores(int[] st)  {
		
		int sum = 0;
		System.out.println("The student scores--------------");
		for (int i=0; i<st.length; i++) {
			System.out.print("\t  " + st[i]);
			sum += st[i];
		} // for i
		
		double avg = (double) sum / st.length;
		
		System.out.println("\n\tstudent total sum " + sum 
				   + "\n\taverage " + avg   + "\n");
		
		return avg;
	} // end of method()
	
	
	
	
	public static void main(String[] args) {
		
		final int numSubjects= 3;
		
		Scanner myInput = new Scanner(System.in);
		int numStudent;
		
		do {
			System.out.print("Enter the number of Student (positive int):");
			numStudent = myInput.nextInt();
		} while (numStudent <= 0);
		
		System.out.println("OK  " + numStudent);
		
		// 2D array
		int[][] studentScore = new int[numStudent][numSubjects];
		
		for (int i=0; i<studentScore.length; i++) {
			
			for (int j=0; j<studentScore[i].length; j++)  {
				
				do {
					System.out.println("Enter an integer number for " + i 
							   + "th student " + j + "th subject score : (positive int) ");
					studentScore[i][j] = myInput.nextInt();
				} while ( studentScore[i][j] <= 0);
				
			}  //  for j
		} // for i
		
	
		double sum = 0;
		for (int i=0; i<studentScore.length; i++) { 
			System.out.println("The " + i + "th student scores--------------");
			sum += printScores(studentScore[i]);    // 1D method argument
			
		}  // for i
	
		System.out.println("\n***  Total average of students  "  + sum / studentScore.length);
		
	}  // end of main()

} // end of class
		
