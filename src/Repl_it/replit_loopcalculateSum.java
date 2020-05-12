package Repl_it;

import java.util.Scanner;

public class replit_loopcalculateSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //int n = s.nextInt();


        int sum = 0;


        System.out.println("please enter your number");
        for(int z = s.nextInt() ; z>0 ; z--){
            sum += z;
        }

        System.out.println(sum);







    }
}



