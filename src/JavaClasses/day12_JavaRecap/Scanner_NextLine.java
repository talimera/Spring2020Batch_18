package JavaClasses.day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some number");
        int num = input.nextInt();
        System.out.println(num);

        input.nextLine(); // we use to get rid of the Enter that comes from previous statements

        System.out.println("Enter your Name");
        String name = input.nextLine();

        System.out.println(name);
    }

}
