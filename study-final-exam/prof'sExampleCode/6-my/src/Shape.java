public class Shape {
    private Point position;
    public Shape(Point position){
        this.position = position;
    }
    public Shape(){
        this(new Point(77, 99));
    }
    public double getArea(){
        return 0.0;
    }
    public Point getPosition(){
        return position;
    }
    public void setPosition(Point position){
        this.position = position;
    }
    @Override
    public String toString(){
        return "Shape [position="+position+"]";
    }
}
