public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(){
        this(222.2);
    }

    @Override
    public double getArea(){
        return radius*radius*3.14;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle [radius = "+radius+"]";
    }
}
