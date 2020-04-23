package JavaClasses.day14_StringClass;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        usarname: cybertek
        password: cybertekschool
         */
        String username = "cybertek";
        String password = "cybertekschool";

        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your password");
        String pass = scan.next();

        if(name.equals(username)&&pass.equals(password)){
            System.out.println("Welcome back, Cybertek");
        }else{
            System.out.println("Invalid username or password");
        }

    }
}
