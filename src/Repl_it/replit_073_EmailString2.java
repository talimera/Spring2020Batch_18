package Repl_it;

import java.util.Scanner;

public class replit_073_EmailString2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            String first = email.substring(0,email.indexOf("_"));
            first = first.substring(0,1).toUpperCase()+first.substring(1);

            String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            last = last.substring(0,1).toUpperCase()+last.substring(1);

            String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
            String toplevel = email.substring(email.indexOf(".")+1);

            String result = "First name: "+first+"\nLast name: "+last+"\nDomain: "+domain+"\nTop-Level Domain: "+toplevel;

            System.out.println(result);


        }
}