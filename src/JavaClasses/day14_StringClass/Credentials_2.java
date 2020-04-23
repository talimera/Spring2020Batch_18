package JavaClasses.day14_StringClass;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Credentials_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* valid credentials are:
            username: cybertek
            password: cybertekschool
            pre condition
            username and password cant be empty
            if they are empty  ==> please enter the credentials
            if user entered both valid username and password ==> log in
            if valid password , invalid usernane ==> username is incorrect
            if valid username, invalid password ==> password is incorrect
            if both are invalid ==> invalid username and password
         */
        System.out.println("Please enter your user name");
        String user = scan.next();
        System.out.println("Please enter your password");
        String pass = scan.next();

        boolean login = user.equals("talha")&&pass.equals("meral");
        boolean invuser = !user.equals("talha")&&pass.equals("meral");
        boolean invpass = user.equals("talha")&& !pass.equals("meral");

        if(!user.isEmpty() && !pass.isEmpty()){
            if(login){
                System.out.println("You logged in");
            }else if(invuser){
                System.out.println("Invalid username");
            }else if(invpass){
                System.out.println("Invalid password");
            }else{
                System.out.println("Username and password are both invalid");
            }

        }else{
            System.out.println("please enter the credentials");
        }


    }
}
