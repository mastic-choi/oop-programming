public class CircleTest {
    public static void main(String[] args){
        Point myCenter = new Point(150, 300);
        Circle myCircle = new Circle(777.7, myCenter);
        System.out.println(myCircle);
        double result = myCircle.getArea();
        System.out.println("The result is " + result);
    }
}
