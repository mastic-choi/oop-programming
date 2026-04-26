public class ComputingNumber {

    static int add(int a, int b){
        return a+b;
    }

    static double multiply(int a, int b){
        return (double)(a * b);
    }

    public static void main(String[] args){
        System.out.println("Hello, This is the OOP class!");
        int a = 2, b = 4;
        System.out.println("2 + 4 = " + (a+b));
        System.out.println("------------------------");
        a = 2;
        b = 6;
        System.out.println("num1 has "+ a);
        System.out.println("num2 has "+ b);
        System.out.println("The add result is "+ add(a, b));
        System.out.println("The multiply result is "+ (int)multiply(a, b));
        System.out.println("------------------------");
        a = 100;
        b = 300;
        System.out.println("num1 has "+ a);
        System.out.println("num2 has "+ b);
        System.out.println("The add result is "+ add(a, b));
        System.out.println("The multiply result is "+ (int)multiply(a, b));
        System.out.println("------------------------");
        a = 3;
        b = 9;
        double result = multiply(a, b);
        System.out.println("The multiply result is "+ (int)result);





    } //end of main




}