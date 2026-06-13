public class ShapeTest {
    public static void main(String[] args){
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(50);
        System.out.println(p2);
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape(p2);
        System.out.println(s2);
        System.out.println(s2.getArea());

    }
}
