package JavaClasses.day35_Static;

import java.util.Scanner;

public class The_Dawg {

    String breed;  // if we make it static , last initialization will be set for all objects.
    String age;
    static boolean isPet = true;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        The_Dawg dawg1 = new The_Dawg();
        dawg1.breed = "Husky";
        dawg1.isPet = true;


        The_Dawg dawg2 = new The_Dawg();
        dawg2.breed = "Chiuahuha";
        dawg2.isPet = false;

        System.out.println(dawg1.isPet);

        System.out.println(dawg1.breed);
        System.out.println(dawg2.breed);
    }
}
