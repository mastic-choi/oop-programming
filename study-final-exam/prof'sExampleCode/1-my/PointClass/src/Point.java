public class Point {
    private int x;
    private int y;
    Point() {
        this(1, 1);
    }
    Point(int a) {
        this(a, a);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return " (x , y) = ( " + x + ", " + y +" )";
    }
    public void setX(int a){
        x = a;
    }
    public void setY(int b){
        y = b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
