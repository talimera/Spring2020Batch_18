package JavaClasses.day17_WhileLoops.day17_warmups;

import java.util.Scanner;

public class Findra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA

         */


        int a = 1;
        while(a<30){
            if (a % 3 == 0){
                System.out.println("FIN");
            }
            if (a % 5 == 0){
                System.out.println("RA");
            }
            if (a % 15 ==0){
                System.out.println("FFINRA");
            }
            a++;
        }
    }





}
