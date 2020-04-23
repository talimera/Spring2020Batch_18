package JavaClasses.day10_Switch_Scanner;

import java.util.Scanner;

public class numbers_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");

        int first = input.nextInt();

        System.out.println("Please enter your second number");

        int second = input.nextInt();

        System.out.println("Please enter your third number");

        int third = input.nextInt();

       int max = (first>second && first > third) ? first: (second >first && second>third) ? second:third;
        System.out.println("Maximum number is: "+max);

        int min =(first<=second && first <= third) ? first: (second <=first && second<=third) ? second:third;
        System.out.println("Minumum number is: "+ min);

        int medium = (first>second && third>first || first>third && second>first) ? first : (second>first && third>second || second>third && first>second) ? second :
                third;
        System.out.println("Medium number is: "+medium);



    }
}
