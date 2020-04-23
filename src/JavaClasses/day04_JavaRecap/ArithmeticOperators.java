package JavaClasses.day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println(10f/4f);
        System.out.println(10/4);  // gives 2  bc compiler takes it as an int. Need to change to float

        double d= 10/4;
        System.out.println(d); // gives 2.0 because of compiler's default choice of int

        System.out.println(10.0/4); // either turn one number or both to decimal or add float number so you can decimal numbers

        System.out.println(10.0/4.0); // will give decimal number as results

        boolean evenNumber = 25%2 ==0;

        System.out.println(evenNumber); // false remainder is going to be 1

        boolean oddNumber = 25%2 != 0;
        System.out.println(oddNumber); // true, remainder will be 1

        System.out.println("10 is an even number: "+ (10%2 ==0));

        System.out.println("25 is odd number: "+ (25%2 != 0));

        System.out.println("25 is even number: " + !(25%2 != 0));

        








    }

}
