package Repl_it;

import java.util.Scanner;

public class replit_023_phone {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your area code");
        int areaCode = scan.nextInt();
        System.out.println("Enter your local number");
        int localNumber = scan.nextInt();

        String phoneNumber= "("+areaCode+")"+"-"+localNumber;

        System.out.println("Calling number "+phoneNumber);

    }
}
