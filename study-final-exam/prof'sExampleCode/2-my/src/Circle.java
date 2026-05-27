public class Circle {
    private double radius;
    private Point p;
    private final double PI = 3.14;

    Circle(){
        radius = 1.0f;
        p = new Point(55, 66);
    }

    Circle(double radius, Point p){
        this.radius = radius;
        this.p = p;
    }
    public String toString(){
        return ("radius " + radius + " at " + p);
    }
    public long calArea(){
        return (long)(radius*radius*PI);
    }
}
