public class MultipleNumbers {
    public static void main(String[] args){
        int sum_of_even = 0;
        int sum_of_seven = 0;

        for(int i = 10; i < 100; i++){
            if(i%2 == 0){
                System.out.printf("% 2d\n", i);
                sum_of_even += i;
            }
            if(i%7 == 0) {
                System.out.printf("% 27d\n", i);
                sum_of_seven += i;
            }

        }
        System.out.printf("Total sum of even numbers : %d\n", sum_of_even);
        System.out.printf("Total sum of multiple numbers  of 7 : %d\n", sum_of_seven);
    }
}
