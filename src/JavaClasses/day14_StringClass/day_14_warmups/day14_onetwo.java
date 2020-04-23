package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;


public class day14_onetwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Warmup tasks:
	0. Wahs your hands

	1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone

					DO NOT USE + OPERATOR
        */

        System.out.println("Please enter two words");

        String words = scan.nextLine();
        String firstword = words.substring(0,words.indexOf(" "));
        String secondword = words.substring(words.indexOf(" ")+1);

        String result =firstword.concat(secondword.concat(secondword.concat(firstword)));
        System.out.println(result);








    }


}
