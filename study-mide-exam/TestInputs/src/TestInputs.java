import java.util.Scanner;
public class TestInputs {
    static int sum(int a, int b) {
        return a+b;
    }
    static int mul(int a, int b) {return a*b ;}
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers :");
        int a, b;
        a = myScanner.nextInt();
        b = myScanner.nextInt();

        System.out.printf("\t%s%d,\n\t%s%d\n", "The first is ", a, "** the second is ", b);
        int result_of_sum = sum(a, b);
        int result_of_mul = mul(a, b);
        System.out.printf("The Addition is [%d]\n",result_of_sum);
        System.out.printf("The Multiplication is [%d]",result_of_mul);

        System.out.printf("\nThe first integer (%d) and the second integer (%d)\n", a, b);
        myScanner.close();
    }
}
