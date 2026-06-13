public class PointTest {
    public static void main(String[] args){
        Point p = new Point(10, 20);
        System.out.println(p);
        System.out.println(p.toString());
        Point q = new Point(222, 333);
        Point r;
        r = q;
        System.out.println(r);
        Point t = new Point(777);
        t.setX(999);
    }
}
