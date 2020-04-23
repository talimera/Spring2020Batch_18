package OfficeHours.Practice_03_18_2020;

public class ShortHandOperator_Practice {

    public static void main(String[] args) {
        //=====================================\\ ADDITION
        int a = 100;
            a += 200; // a will become 300

        System.out.println(a);

            a += 200*3;

        System.out.println(a);

        //===================================\\ SUBTRACTION

        a -= 400;

        System.out.println(a);


        int b = 300;
        b -= 3*40;

        System.out.println(b);
        //=====================================\\ MULTIPLICATION

        int x = 5;
        x *= 3;

        System.out.println(x);

        x *= 2+1;
        System.out.println(x);


        //=====================================\\ DIVISION

        int n = 900;

        n /= 3;

        System.out.println(n);
         n /= 3*5 ;
        System.out.println(n);

        //=====================================\\ REMAINDER

        int m = 10;

        m %= 3 ;
        System.out.println(m); //1

        int y = 300;

        y %= 5*3;
        System.out.println(y);




    }

}
