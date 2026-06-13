public class Point {
    private int x;
    private int y;
    static int TotalNumberPoint = 0;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        TotalNumberPoint += 1;
    }
    public Point(){
        this(1, 1);
    }
    public Point(Point pt){
        this(pt.getX(), pt.getY());
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return "(x, y) = ( " + x +", "+y+" )";
    }
}
