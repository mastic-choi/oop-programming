class Circle{
    private double radius;
    private Point center;
    private final double PI = 3.14;
    Circle() {
        this(1.0, new Point(55, 66));
    }
    Circle(double r, Point c){
        radius = r;
        center = c;
    }
    public String toString(){
        return "radius "+radius+" at " + center;
    }
    public double getArea(){
        return radius*radius*PI;
    }
}