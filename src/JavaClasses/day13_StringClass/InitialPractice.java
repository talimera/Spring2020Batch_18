package JavaClasses.day13_StringClass;

import java.util.Scanner;

public class InitialPractice {

    /* Assignment
            write me a program that asks the user first and last names than ; take the initials
            input
            Cybertek School
            output
            CS
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullname = scan.nextLine();

        String firstname = fullname.substring(0,fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ")+1);

        String initial= firstname.substring(0,1).toUpperCase()+lastname.substring(0,1).toUpperCase();
        // ^^^^ taking initials from full name turning them into Uppercase letters than , combining them.
        String full = firstname.substring(0,1).toUpperCase()+firstname.substring(1,firstname.length())+" "+lastname.substring(0,1).toUpperCase()+lastname.substring(1,lastname.length());
        // ^^^^ making initials uppercase then printing full name

        System.out.println(initial);
        System.out.println(full);

    }
}
