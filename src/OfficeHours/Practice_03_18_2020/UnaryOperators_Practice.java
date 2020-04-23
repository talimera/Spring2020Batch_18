package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {

    public static void main(String[] args) {

        //=====================================\\ POST INCREMENT/DECREMENT

        int a= 20; a++;

        System.out.println(a++);

        int b = 30;
        int c = b--;
        System.out.println(c);
        System.out.println(b);

        //=====================================\\ PRE INCREMENT/DECREMENT

        int x= 200;
        System.out.println(--x); // 199


        int z= 100; // 100/101/100/99/100

        z= z++ + --z - z-- + ++z;

        System.out.println(z);


        int u = 900; // 901/902/903
        int r = - ++u + ++u + -u++;
        System.out.println(r);
        System.out.println(u);


    }
}
