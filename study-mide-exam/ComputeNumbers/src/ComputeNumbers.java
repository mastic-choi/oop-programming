import java.util.Scanner;

public class ComputeNumbers {
    static int add(int a, int b){ return a+b;}
    static int sub(int a, int b) {return a-b;}
    static int mul(int a, int b) {return a*b;}

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("addion        :  ADD,  enter two integers. ");
        System.out.println("subtaction    :  SUB,  enter two integers. ");
        System.out.println("multiplication:  MUL,  enter two integers. ");
        System.out.print(">> ");
        String order = myScanner.next();
        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int finalNumber = 0;

        switch(order){
            case("ADD"):
                finalNumber = add(num1, num2);
                break;
            case("SUB"):
                finalNumber = sub(num1, num2);
                break;
            case("MUL"):
                finalNumber = mul(num1, num2);
                break;

            default :
                System.out.println("Error Code!");
        }


        System.out.println("The result is " + finalNumber);
    }
}
