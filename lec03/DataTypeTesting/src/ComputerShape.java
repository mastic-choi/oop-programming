public class ComputerShape {
    final static double PI = 3.14;
    public static double computeArea(double r){
        return (r * r * PI);
    }
    public static void main(String[] args) {

        double radius = 23.4;
        double area = computeArea(radius);
        System.out.println("area is "+area);
    }
}
