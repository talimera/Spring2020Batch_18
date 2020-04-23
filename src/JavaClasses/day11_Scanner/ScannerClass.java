package JavaClasses.day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a long number");

        long num1 = input.nextLong();

        System.out.println("You have entered: "+num1);

        System.out.println("Enter a decimal");
        float b = input.nextFloat(); // will give decimal number if given whole number bc input will be taken as a float number
        System.out.println("You have entered "+b);

        System.out.println("Enter decimal number");
        double c = input.nextDouble();
        System.out.println("You have entered: "+c);

        System.out.println("Enter true or false");
        boolean tr = input.nextBoolean();

        System.out.println("Enter your sentence: ");

        String str = input.next();
        System.out.println("You have entered: "+str);


    }
}
