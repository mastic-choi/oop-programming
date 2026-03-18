public class  DataTypeTesting {
    public static void main(String[] args) {
        int myInt;
        short myShort;
        myInt = 100;
        myShort = 200;
        byte myByte = 23;
        double myDouble = 3.14321;
        boolean myBoolean = true;
        char myChar = 'a';

        System.out.println("int: "+myInt);
        System.out.println("short: "+myShort);
        System.out.println("byte: "+myByte);
        System.out.println("double: "+myDouble);
        System.out.println("boolean: "+myBoolean);
        System.out.println("char: "+myChar);


        System.out.println("the max value of int : "+Integer.MAX_VALUE);
        System.out.println("the max value of short : "+Short.MAX_VALUE);
        System.out.println("the max value of byte : "+Byte.MAX_VALUE);
        System.out.println("the max value of double : "+Double.MAX_VALUE);

        System.out.println("the min value of int : "+Integer.MIN_VALUE);
        System.out.println("the min value of short : "+Short.MIN_VALUE);
        System.out.println("the min value of byte : "+Byte.MIN_VALUE);
        System.out.println("the min value of double : "+Double.MIN_VALUE);


    }

}