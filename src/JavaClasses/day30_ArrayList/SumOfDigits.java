package JavaClasses.day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {

    public static void main(String[] args) {

        /*
        1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
         */

        String str = "a1b2b3";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        int sum = 0;
        for (char each : chars){
            if (each>=48 && each<=57){              // ascii table method
               sum += Integer.parseInt(each+"");
            }
            if (Character.isDigit(each)){           // Character.isDigit() method to identify if character is  digit or not
                sum += Integer.parseInt(each+"");
            }
        }

        boolean a = Character.isAlphabetic('a'); // identifies if the character is alphabet or not.



        System.out.println(sum);



    }
}
