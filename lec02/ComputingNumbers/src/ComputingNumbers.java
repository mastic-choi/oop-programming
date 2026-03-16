public class ComputingNumbers {
    static int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("Hello, This is the oop class!");
        System.out.println("2 + 4 = "+ (2+4));

        int num1 = 2;
        int num2 = 6;
        System.out.println("The num1 has " + num1);
        System.out.println("The num2 has " + num2);
        System.out.println("The add result is " + add(num1, num2));
        System.out.println("The multiply result is " + multiply(num1, num2));
        System.out.println("---------------------------");

        num1 = 100;
        num2 = 350;
        System.out.println("The num1 has " + num1);
        System.out.println("The num2 has " + num2);
        System.out.println("The result is " + add(num1, num2));
        System.out.println("The multiply result is " + multiply(num1, num2));
    }
}