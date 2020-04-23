package JavaClasses.day20_ArraysContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] months = {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        /*
        String [] months2 = new String [12];
                  months2[0] = "Jan";

         */
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int attempts = 0;

        while (num>12 || num <=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = scan.nextInt();
            attempts++;

            if (attempts==2 &&(num>12 || num <=0) ){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }

        String result = months[num-1];
        System.out.println(result);

    }

}
