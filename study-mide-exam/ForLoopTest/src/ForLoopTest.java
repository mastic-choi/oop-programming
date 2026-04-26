public class ForLoopTest {
    public static void main(String[] args){
        int i;
        int sum = 0;
        for(i = 0; i < 10; i ++){
            sum+= i;
        }
        System.out.println("After loop " + i);
        System.out.println("Total sum " + sum);
        sum = 0;
        for (i = 0; i < 50; i+= 7){
            System.out.println("i : " + i);
            sum+= i;
        }
        System.out.println("After loop " + i);
        System.out.println("Total sum " + sum);
    }
}
