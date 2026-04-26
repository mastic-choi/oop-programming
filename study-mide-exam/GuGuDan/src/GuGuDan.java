public class GuGuDan {
    public static void main(String[] args){
        for(int dan = 2; dan <= 20; dan++){
            System.out.printf("* %d dan\n", dan);
            for(int col = 1; col <= 10; col++){
                System.out.printf("\t %d * %d = %d", dan, col, (dan*(col)));
                if(col % 5 == 0){
                    System.out.print("\n");
                }
            }
        }
    }
}
