package JavaClasses.day18_NestedLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        /*
        2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();
        int fact =1;

        while(num>0){
            fact *= num;
            num--;
        }

        System.out.println(fact);
    }

}
