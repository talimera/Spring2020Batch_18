package Repl_it;

import java.util.Scanner;
/*

Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */


public class replit_032_SecondsConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Enter seconds");
        int inputSeconds = scan.nextInt();


        int inputhours = inputSeconds/3600;
        int inputminutes= (inputSeconds%3600)/60;
        int inputseconds= inputSeconds%60; // second %60 === seconds


        System.out.println(inputSeconds+" seconds is equal to "+inputhours+" hours, "+inputminutes+" minutes, "+inputseconds+" seconds");



    }
}
