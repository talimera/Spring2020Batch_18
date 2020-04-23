package Repl_it;

import java.util.Scanner;

public class replit_035_GiftCard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
                 Example #1
                input: Hat
                output: Thank you for your purchase!
                output: Your current balance is: 75$

                Example #2
                input: Pants
                output: Thank you for your purchase!
                output: Your current balance is: 50$

                Example #3
                input: Laptop
                output: Sorry, not enough funds on your gift card!

                Example #4
                input: Cupcake
                output: Invalid item!
         */

        String item = scan.nextLine();
        double price = 0;

        if(price<=100){

        }else{
            System.out.println("Sorry, not enough funds on your gift card");
        }

    }

}
