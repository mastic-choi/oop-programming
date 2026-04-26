import java.util.Scanner;
public class CaseTest {


    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int num1;
        System.out.print("Enter an integer number : ");
        num1 = myScanner.nextInt();

        if (num1 % 3 == 0){
            System.out.println("multiple number of 3");
        }else if(num1 % 3 == 1){
            System.out.println("multiple number of 3 plus 1");
        }else{
            System.out.println("multiple number of 3 plus 2");
        }

        System.out.print("\n\n\nEnter an integer number of score: ");
        int myScore = myScanner.nextInt();

        if(myScore >= 60) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Cheer UP!");
        }




    }


}
