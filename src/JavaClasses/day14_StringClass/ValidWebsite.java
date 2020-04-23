package JavaClasses.day14_StringClass;

import java.util.Scanner;

public class ValidWebsite {

    public static void main(String[] args) {

        /* write a program that can validate if the web address is valid
                requirement
                    must starts with www.
                    must ends with .com or .edu .net .gov
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("your website");
        String website = scan.next();
        website = website.toLowerCase();
        boolean ending = website.endsWith(".com") || website.endsWith(".net") || website.endsWith(".edu") || website.endsWith(".gov");

        if(website.startsWith("www.")&& ending){
            System.out.println("Valid website");
        }else{
            System.out.println("Invalid website");
        }
    }

}
