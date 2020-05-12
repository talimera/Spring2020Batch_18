package Repl_it;

import java.util.Scanner;

public class replit_072_EmailString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();




        if(email.contains("_")){
            String first = email.substring(0,email.indexOf("_"));
            String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            System.out.println(last+"_"+first+"@gmail.com");
        }else{
            System.out.println(email);
        }



    }
}

