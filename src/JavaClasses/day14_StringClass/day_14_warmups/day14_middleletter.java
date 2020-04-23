package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;

public class day14_middleletter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        	3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
         */

        System.out.println("Please enter a word");
        String word = scan.next();

        String middle ="";
        int midnumb = word.length()/2;

        if(word.length()%2==0){
            middle = word.substring(midnumb-1,midnumb+1);
        } else {
            middle = word.charAt(midnumb)+"";
        }
        System.out.println(middle);







    }
}
