public class PointTest {

    public static void main(String[] args){
        Point p = new Point(10, 20);
        System.out.println(p.toString());
        System.out.println(p);

        Point p1 = new Point(222, 333);
        System.out.println(p1.toString());
        System.out.println(p1);

        Point p2 = new Point();
        System.out.println(p2.toString());
        System.out.println(p2);

        Point p3 = new Point(777);
        System.out.println(p3.toString());
        System.out.println(p3);

        p3.setter_x_Point(999);
        System.out.println(p3.toString());
        System.out.println(p3);

    }
}
