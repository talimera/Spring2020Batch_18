package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;

public class day14_FirstLastTrue {
    /*
    Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a name");
        String name = scan.next();

        boolean same = name.charAt(0) == name.charAt(name.length()-1);

        if (same){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




    }

}
