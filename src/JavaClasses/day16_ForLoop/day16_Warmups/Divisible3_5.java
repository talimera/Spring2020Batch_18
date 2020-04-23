package JavaClasses.day16_ForLoop.day16_Warmups;

import java.util.Scanner;

public class Divisible3_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=100; i++){
            if(i%2 !=0){ // for odd number if we change to i%2 == 0 that would be for even numbers
                if(i%15==0){
                    System.out.println(i+" can be divided by 3 and 5.");
                }
            }

        }
    }
}
