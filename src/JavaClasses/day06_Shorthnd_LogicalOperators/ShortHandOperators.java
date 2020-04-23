package JavaClasses.day06_Shorthnd_LogicalOperators;

public class ShortHandOperators {

    public static void main(String[] args) {

            int x = 20;
                x+= 10;

        System.out.println(x);

        x += 60;
        System.out.println(x);

        String schoolname = "CyberTek"; // When it applies to String it will create concetenation.

            schoolname+= 12345;

        System.out.println(schoolname);

        int A =100;
            A-= 90;
        System.out.println(A); // A=10
        int B= 200;
            B-= A; // A's current value is 10 !!
        System.out.println(B);

        int a =3;
        a*=3;

        int b = a*10;
        System.out.println(b);
        System.out.println(a);

        int a1= 100;
        int b1= (a1*=2) + ++a1; // care for left to right execution of line of code !!!
        System.out.println(a1);
        System.out.println(b1);



        int num1= 300;
        num1 /=2 ;
        System.out.println(num1);
    }
}
