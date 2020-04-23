package JavaClasses.day13_StringClass;

import com.sun.org.apache.bcel.internal.util.ClassStack;

import java.util.Scanner;

public class StringManipulations_Practice {

    public static void main(String[] args) {

        /* enter your full name
        display first name and last name seperately
        First letters has to be Uppercase for Firstname Lastname
        input: CyhbesrG sCHohOl turns into Cybertek School
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullName = scan.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println("Your first name is: "+firstName);
        System.out.println("Your last name is: "+lastName);


        /* Assignment
            write me a program that asks the user first and last names than ; take the initials
            input
            Cybertek School
            output
            CS
         */



    }

}
