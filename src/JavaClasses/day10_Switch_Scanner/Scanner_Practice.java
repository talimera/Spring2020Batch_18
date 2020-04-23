package JavaClasses.day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first Number");
        byte num1 = input.nextByte();
        System.out.println("Enter your second Number");
        byte num2 = input.nextByte();

        System.out.println("Sum of the numbers is: " + (num1+num2));

        short n1 = input.nextShort();
        short n2 = input.nextShort();

        System.out.println("Sum of the numbers is: " + (n1+n2));


    }

}
