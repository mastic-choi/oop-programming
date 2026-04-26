public class DataTypeNumber{
    public static void main(String[] args){
        int myInt = 100;
        short myShort = 200;
        byte myByte = 30;
        double myDouble = 234.34543;
        boolean myBoolean = true;
        char myChar = 'a';

        System.out.println("int : " + myInt);
        System.out.println("short : " + myShort);
        System.out.println("byte : " + myByte);
        System.out.println("double : " + myDouble);
        System.out.println("boolean : " + myBoolean);
        System.out.println("char : " + myChar);

        System.out.println("the max value of int : " + Integer.MAX_VALUE);
        System.out.println("the max value of short : " + Short.MAX_VALUE);
        System.out.println("the max value of byte : " + Byte.MAX_VALUE);
        System.out.println("the max value of double : " + Double.MAX_VALUE);


        System.out.println("the max value of int : " + Integer.MIN_VALUE);
        System.out.println("the max value of short : " + Short.MIN_VALUE);
        System.out.println("the max value of byte : " + Byte.MIN_VALUE);
        System.out.println("the max value of double : " + Double.MIN_VALUE);

    }


}