import java.util.Scanner;

public class ScoreManager {
    public static double printScores(int[] st){
        double result = 0;
        for (int i = 0; i < st.length; i ++){
            result += st[i];
        }
        return result/(st.length);
    }

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        final int numSubjects = 3;
        int numStudent;
        do {
            numStudent = myScanner.nextInt();
            if(numStudent > 0){
                System.out.println("OK " + numStudent);
            }
        } while(numStudent <= 0);
        int[][] studentScore = new int[numStudent][numSubjects];
        for (int i = 0; i < numStudent; i ++ ){
            int tmp = 0;
            for (int j = 0; j < numSubjects; j++){
                do {
                    tmp = myScanner.nextInt();
                }while(tmp <= 0);
                studentScore[i][j] = tmp;
            }
        }
        double sum = 0;
        for (int q = 0; q <numStudent; q++){
            sum += printScores(studentScore[q]);
        }
        System.out.println(sum / numStudent);

    } // end of main

}
