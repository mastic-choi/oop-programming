public abstract class Shape {
    private Point position;
    public Shape(Point position){
        this.position = position;
    }
    public Shape(){
        this(new Point(77, 99));
    }
    public abstract double getArea();
    public Point getPosition() {return position;}
    public void setPosition(Point position){this.position = position;};

    public String toString(){
        return "Shape [position ="+position+"]";
    }
}
