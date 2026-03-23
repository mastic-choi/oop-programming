import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter two integers numbers : ");
        int num1;
        int num2;
        num1 = myinput.nextInt();
        num2 = myinput.nextInt();
        System.out.println("First is "+num1+" and Second is "+num2);
        System.out.println("The addition is "+ sum(num1, num2));
        System.out.println("The multiplication is "+ multiply(num1, num2));
        System.out.printf("%nThe First integer (%d) and the second integer (%d) %n" ,num1 ,num2);
        //end of main()

    }

}