package Repl_it;

import java.util.Scanner;

public class replit_045_Burger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String in = scan.next();
        float price = 10;
        float soda = 2;

        if(in.equalsIgnoreCase("chicken")||in.equalsIgnoreCase("burger")){
            System.out.println(price);
        }
        if(in.equalsIgnoreCase("soda")){
            System.out.println(soda);
        }
    }
}
