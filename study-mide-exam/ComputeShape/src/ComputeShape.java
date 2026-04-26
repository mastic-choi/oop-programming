//import java.util.Scanner;


public class ComputeShape {
    final static double PI = 3.14;

    public static double computeArea(double r){
        return r * r * PI;
    }


    public static void main(String[] args){
        //Scanner myScanner = new Scanner(System.in);

        double radius;
        radius = 23.4;
        //radius = myScanner.nextInt();
        double area = computeArea(radius);
        System.out.println("The area is " + area);

    }
}
