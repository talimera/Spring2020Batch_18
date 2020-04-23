package JavaClasses.day17_WhileLoops.day17_warmups;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	    2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
         */

        int max = -999999999;

        int min = 999999999;

        for (int i =1; i<10; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num>max) { // compare the each user input, and assign the maximumm number to max
                max = num;
            }
            if (num<min){ // compare the each user input and assign minumum number to min
                min = num;
            }


        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minumum number: "+min);






    }

}
