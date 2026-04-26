import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        int score = 0;
        int sum = 0;
        int count = 0;
        do {
            System.out.println("Enter an integer number for score : (-1 for exit)");
            score = myScanner.nextInt();
            sum += score;
            count += 1;
            System.out.println("-------------- \n" + score);
        }while(score != -1);{
            System.out.println("\n total sum is " + sum);
            System.out.println("\n Average is  " + (double)sum/count);
        }
    }


}