package JavaClasses.day22_Arrays_Loops_Practice;

import java.util.Arrays;

public class EvenNumbers {

    public static void main(String[] args) {

        /*
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
         */

        int [] number = new int[100];

        for (int i = 0; i<number.length; i++){
            number[i] = i;
        }
        System.out.print(Arrays.toString(number));
        System.out.println();

        for (int each : number){
            if (each %2 !=0){
                continue;
            }
            System.out.print(each+" ");
        }

    }
}
