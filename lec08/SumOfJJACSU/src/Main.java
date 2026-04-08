import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long result = 0;
        if (n < 0){
            System.out.println(0);
        }else{
            for(int i = 1 ; i <= n; i ++){
                if( i%2 == 0){
                    result += i;
                }
            }
            System.out.println(result);
        }

    }
}