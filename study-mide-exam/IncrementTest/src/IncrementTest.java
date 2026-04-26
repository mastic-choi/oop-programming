public class IncrementTest {
    public static void main(String[] args){
        int aaa;
        aaa = 5;
        int bbb;

        System.out.println("aaa = "+ aaa);
        System.out.println("------  prefix increment --------");

        bbb = ++aaa;
        System.out.println("aaa = "+aaa); //6
        System.out.println("bbb = "+bbb); //6
        System.out.println("------  postfix increment --------");

        aaa = 5;
        bbb = aaa++;
        System.out.println("aaa = "+aaa); //6
        System.out.println("bbb = "+bbb); //5
        System.out.println("------  increment test --------");
        aaa = 10;
        System.out.println("aaa = " + aaa++); // 10
        System.out.println("aaa = "+ aaa);    // 11
        System.out.println("aaa = " + ++aaa); // 12
        System.out.println("aaa = "+ aaa);    // 12

    }
}
