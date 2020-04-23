package JavaClasses.day11_Scanner;

import java.util.Scanner;


public class NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Full Name");

        String fullname = input.nextLine(); // accepts the ENTER key from keyboard . Only this scanner method does accept enter key !!!!

        System.out.println(fullname);

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();

        System.out.println("You entered: "+ sentence);

    }

}
