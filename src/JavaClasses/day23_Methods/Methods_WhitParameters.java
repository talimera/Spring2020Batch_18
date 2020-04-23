package JavaClasses.day23_Methods;

import java.util.Scanner;

public class Methods_WhitParameters {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Give me your age fool");
        EligibletoButAlcohol(scan.nextInt());

    }

    public static void EligibletoButAlcohol (int age){
        if (age >=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
    }

}
