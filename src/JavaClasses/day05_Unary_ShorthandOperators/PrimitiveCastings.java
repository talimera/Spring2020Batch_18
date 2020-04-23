package JavaClasses.day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        int a = 10;
        long b = a; // b =10l implicit casting done automatically.


        // doing manually implicit casting but not needed necessarily
        int a1= 100;
        long b1= (long)a1;

        System.out.println(b1);


        // explicit casting

        int num1= 100;
        byte num2= (byte)num1;

        short num3= (short)num1;

       double dnum = 5.5;

       float fnum = (float)dnum;

       double d= 6.5;
       int c=(int)d;
        System.out.println(c); // it will give 6, bc it is whole number.

        float c1= (int)d;

        System.out.println(c1); // it will give 6.0 bc it has turned into float variable and it comes with decimal

        double D1= 10.5;
        long l1= (long) ((float)D1);
        System.out.println(l1); // it compiles decimal into Long number. As a result of that decimal number turns into whole number.


        float g1= 60.5f;
        int i1= (int)g1;

        System.out.println(i1);


    }


}
