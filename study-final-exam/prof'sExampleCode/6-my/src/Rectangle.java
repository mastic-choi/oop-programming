public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        super();
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this(111, 222);
    }

    @Override
    public double getArea(){
        return height*width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }

    @Override
    public String toString(){
        return "Rectangle [heigth = "+height+"]";
    }
}
