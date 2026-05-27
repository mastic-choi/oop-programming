public class CircleTest {
    public static void main(String[] args){
        Point p1 = new Point(150, 300);
        Circle c1 = new Circle(777.7, p1);
        System.out.println(c1);
        double area = c1.calArea();
        System.out.println("The result is "+ area);
    }
}
