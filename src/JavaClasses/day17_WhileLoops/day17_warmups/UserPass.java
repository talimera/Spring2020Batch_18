package JavaClasses.day17_WhileLoops.day17_warmups;

import java.util.Scanner;

public class UserPass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = scan.next(); // talhameral
        System.out.println("Enter your password");
        String pass = scan.next(); // meral123

        boolean valid =user.equalsIgnoreCase("talhameral")&& pass.equalsIgnoreCase("meral123");

        int count =1;

        while (!valid) {
            System.out.println("Invalid Entry.Please re-enter");
            user = scan.next();
            pass = scan.next();

            valid =user.equalsIgnoreCase("talhameral")&& pass.equalsIgnoreCase("meral123");

                    count++;
                if (count == 3 && !valid) {
                    System.out.println("Your account is locked");
                    break;
                }

        }
        if (valid) {
            System.out.println("Login successful,Welcome back Talha");
        }

    }

}
