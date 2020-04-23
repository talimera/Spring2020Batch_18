package JavaClasses.day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 7921 JonesBranch Dr, McLean VA, 22034

        //fullAddress: Building-number Street, city, state zipcode\\

        System.out.println("Building Number: ");
        int Bnum = input.nextInt();

        input.nextLine();

        System.out.println("Street: ");
        String Street = input.nextLine();

        System.out.println("Your City and State");
        String CityandState = input.nextLine();

        System.out.println("Enter your Zipcode");
        int Zipcode = input.nextInt();

        System.out.println("Your Adress is: ");
        String fulladress =Bnum+ " "+ Street+" \n"+CityandState +" "+Zipcode;

        System.out.println(fulladress);

        input.close(); // closes the scanner




    }


}
