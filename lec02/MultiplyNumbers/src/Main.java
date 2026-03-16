import java.util.Scanner;
class Main {
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(multiply(num1, num2));
    }
}