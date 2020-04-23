package Repl_it;

import java.util.Scanner;

public class replit_033_Caffeine_Arthimetic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
        lethal overdose.

        Write a program with a variable that holds the number of milli-
        grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

        A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
        of coffee has approximately 160 mg of caffeine.

        In one gram there are 1000 mg.

        Please refer to the image above as an example and use any number of variables you want.
        Dots mean a space in the image.
         */
        System.out.println("Please enter a can of cola's caffeine value");
        int cola = scan.nextInt(); // 34
        System.out.println("Please enter a cup of coffee's caffeine value");
        int coffee = scan.nextInt(); // 160

        double lethaldose = 10000;

        System.out.println("It would take about "+ (lethaldose/cola)+ " cans of cola for a lethal overdose");

        System.out.println("It would take about "+(lethaldose/coffee)+" cups of coffee for alethal overdose");







    }
}
