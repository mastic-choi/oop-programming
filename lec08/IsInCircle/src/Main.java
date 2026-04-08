import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float r = sc.nextFloat();
        float x_ = sc.nextFloat();
        float y_ = sc.nextFloat();

        float check = (x_-x)*(x_-x) + (y_-y)*(y_-y);
        System.out.println(check <= (r * r));

    }
}