public class TestingWhile {
    public static void main(String[] args){
        int count = 0, sum = 0;
        while (count < 10){
            sum += count;
            System.out.println("현재 count 값 : " + count + "  =>  현재 누적 sum 값 : " + sum);
            count+= 1;
        }
    }
}
