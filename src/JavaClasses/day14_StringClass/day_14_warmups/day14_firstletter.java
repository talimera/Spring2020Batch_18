package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;

public class day14_firstletter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
	2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.

			Input:
				apple
				banana
			Output:
				ppleanana
         */

        System.out.println("Please enter two word");

        String words = scan.nextLine();
        String first = words.substring(0,words.indexOf(" "));
        String last = words.substring(words.indexOf(" ")+1);

        System.out.println(first.substring(1).concat(last.substring(1)));

    }

}
