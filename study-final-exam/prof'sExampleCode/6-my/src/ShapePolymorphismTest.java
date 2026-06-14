public class ShapePolymorphismTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for(int i = 0; i < 2; i++){
            System.out.println(shapes[i]);
            System.out.println("Area: "+shapes[i].getArea());
        }
    }
}
