package JavaClasses.day19_Arrays;

import java.util.Scanner;

public class Array_Practice2 {

    public static void main(String[] args) {

        int [] arr = {10,20,30};

        System.out.println(arr.length);

        int[] arr2 = new int[5];

        System.out.println(arr2);

        System.out.println(arr2[4]); // gives us 0 because the default value of the int is zero

        String [] Testers = new String[3];  // {"Reem" , "Madina", "Osman"}

        Testers[0] = "Reem";
        Testers[1] = "Madina";
        Testers[2] = "Osman";

        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        System.out.println(Testers[2]);

        System.out.println(Testers.length);

        System.out.println("========================================================");

        String [] student = new String[10];

        Scanner scan = new Scanner(System.in);

        for (int i =0; i<=9; i++){
            System.out.println("Enter names");
            String names = scan.nextLine();

            student[i] += names;


        }

        System.out.println(student[4]);






    }
}
