package Repl_it;

import java.util.Scanner;

public class replit_046_SliceNumber_Arithmetic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        In this task, you need to slice an integer and print numbers one by one from new line.

        Create a scanner object

        Example # 1
        -Display prompt: Enter your number:
        12345
        -Display prompt: 1
        -Display prompt: 2
        -Display prompt: 3
        -Display prompt: 4
        -Display prompt: 5

        Example # 2

        -Display prompt: Enter your number:
        45678
        -Display prompt: 4
        -Display prompt: 5
        -Display prompt: 6
        -Display prompt: 7
        -Display prompt: 8

        Use / and % operators

         */
        System.out.println("Enter your number");
        int number = scan.nextInt();

        int digit1 = number/10000;
        int digit2 = (number%10000)/1000;
        int digit3 = (number%1000)/100;
        int digit4 = (number%100)/10;
        int digit5 = number%10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);




    }
}
