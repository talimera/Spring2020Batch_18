package JavaClasses.day16_ForLoop.day16_Warmups;

import java.util.Scanner;

public class CalculateGiven_Sum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your number");
        int x = scan.nextInt();
        int sum= 0;
        if(x>=1){
        for (int i=1; i <= x; i++){
            sum += i;
            }
        }
        System.out.println(sum);

        }

}
