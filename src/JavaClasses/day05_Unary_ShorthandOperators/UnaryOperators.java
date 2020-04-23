package JavaClasses.day05_Unary_ShorthandOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a= +10;  // by default it takes as a positive number
        int b= +a;

        int a2= -10;
        boolean result1 = a2>0;
        boolean result2 = a2<0;

        System.out.println(result1);
        System.out.println(result2);

        int x1 = -10;
        int y1 = -x1;

        System.out.println(y1);

        int P = 100;
        System.out.println(P++);
        System.out.println(P);








    }

}
