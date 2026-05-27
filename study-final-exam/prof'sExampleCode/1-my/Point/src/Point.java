public class Point {
    private int x;
    private int y;
    Point(){
        //생성자
        this(1, 1);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(int n){
        x = n;
        y = n;
    }
    public String toString(){
        return ("( x, y = ( "+x+", "+y+" ) ");

    }
    public void setter_x_Point(int x){
        this.x = x;
    }
    public void setter_y_Point(int y){
        this.y = y;
    }
    public int getter_x_Point(){
        return this.x;
    }
    public int getter_y_Point(){
        return this.y;
    }
}
