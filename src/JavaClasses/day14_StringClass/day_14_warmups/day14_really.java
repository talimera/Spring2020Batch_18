package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;

/*
Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
 */

public class day14_really {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your word");
        String word = scan.next();

        if(word.endsWith("ly")){
            System.out.println("Really?");
        }else{
            System.out.println("Never Mind");
        }

    }

}
