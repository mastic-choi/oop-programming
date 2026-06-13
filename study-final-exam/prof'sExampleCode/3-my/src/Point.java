public class Point {
    private int x;
    private int y;
    public Point(int a , int b) {
        x = a;
        y = b;
    }
    public Point(double x, double y){
        this.x = (int) x;
        this.y = (int) y;
    }
    public Point(){
        this(1, 1);
    }
    public Point(int a){
        this(a, a);
    }
    public Point(Point tmp){
        this(tmp.getX(),tmp.getY() );
    }
    public void print(){
        System.out.println("( x, y ) = ( "+x+", "+y+ " )");
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
