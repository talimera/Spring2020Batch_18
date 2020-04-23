package JavaClasses.day15_ForLoop;

import java.util.Scanner;


public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your word");
        String str = scan.next();

        String reverse = "";
        for (int i= str.length()-1; i>=0; i--){
            //System.out.print(str.charAt(i));
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        /*
        write a program that identify if a string is palindrome or not if yes print true , otherwise ==>false care case sensitivity do it both ways
         */

    }
}
