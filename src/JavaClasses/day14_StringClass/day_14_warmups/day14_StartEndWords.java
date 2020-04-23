package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;

/*
Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
 */

public class  day14_StartEndWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String first = scan.next();
        System.out.println("Enter your second word");
        String second = scan.next();
        int length1 = first.length();
        int length2 = second.length();

        if(length1==5 && length2==5){
            if(first.charAt(4)== second.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz - did not match");
            }

        }else{
            System.out.println("need to be exactly be 5 chars length");
        }


    }

}
