public class Rectangle extends Shape {
    private int height;
    private int width;
    public Rectangle(int height, int width){
        super();
        this.height = height;
        this.width = width;
    }
    public Rectangle(Point pos, int height, int width){
        super(pos);
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this(new Point(), 555, 666);
    }
    @Override
    public double getArea(){
        return height*width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void relocate(){
        int tmp = height;
        height = width;
        width = tmp;
    }
    @Override
    public String toString(){
        return "Rectangle [height="+height+", width="+width+"  with  "+super.toString();
    }
}
