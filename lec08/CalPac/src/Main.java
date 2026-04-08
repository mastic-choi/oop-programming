import java.util.Scanner;

class Main{
    public static int calpac(int x){
        if (x == 1 || x == 0){
            return 1;
        }else if (x < 0){
            return -1;
        }
        else{
            return calpac(x-1) * x;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long result = calpac(x);
        System.out.println(result);

    }
}