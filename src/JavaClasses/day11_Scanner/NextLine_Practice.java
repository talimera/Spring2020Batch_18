package JavaClasses.day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 30 + Enter
        System.out.println("Your age is: "+age);

        input.nextLine(); // <<< this takes out the enter that left out from int method !!!!!

        System.out.println("Enter your Full Name: ");
        String fullname = input.nextLine();
        System.out.println("Your full name is: "+fullname);





    }
 }