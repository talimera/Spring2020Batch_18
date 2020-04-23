package JavaClasses.day20_ArraysContinue;

import java.util.Scanner;

public class Arrays_Days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] days = {"monday", " tuesday","wednesday","thursday","friday","saturday","sunday"};

        System.out.println("Enter a number of day ");
            int day = scan.nextInt()-1;
            int attempt = 1;


            while ((day<1 || day>7)){

                System.out.println("Invalid entry, please re-enter the number");
                day = scan.nextInt();
                attempt++;

                if (attempt==3 && (day<1 || day>7)){
                    System.exit(0);
                }

        }
            System.out.println("Its "+days[day]);






    }


}
