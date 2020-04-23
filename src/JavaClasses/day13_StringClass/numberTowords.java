package JavaClasses.day13_StringClass;

import java.util.Scanner;
/*write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

 */
public class numberTowords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0-9");

        int number = scan.nextByte();
        String result ="";

        switch(number){
            case 0: result= "Zero";
            break;
            case 1: result= "One";
            break;
            case 2: result= "Two";
            break;
            case 3: result= "Three";
            break;
            case 4: result= "Four";
            break;
            case 5: result= "Five";
            break;
            case 6: result= "Six";
            break;
            case 7: result= "Seven";
            break;
            case 8: result= "Eight";
            break;
            case 9: result = "Nine";
            break;
            default: result = "Invalid";

        }

        System.out.println(result);

        String result2 = (number==0)? "Zero": (number==1)? "One":(number==2)? "Two":(number==3)? "Three":(number==4)? "Four":
                (number==5)? "Five":(number==6)? "Six":(number==7)? "Seven":(number==8)? "Eight":(number==9)? "Nine": "Invalid";

        System.out.println(result2);
    }

}
