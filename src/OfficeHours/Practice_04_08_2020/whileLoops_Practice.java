package OfficeHours.Practice_04_08_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class whileLoops_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
            while(condition){   // only condition is needed
                statements
         */

        for (int i =0; i<5; i++){
            System.out.println("Hello world");
        }

        System.out.println("======================================");

        int z = 0;
        while (z<5){
            System.out.println("Hello Cybertek");
            z++; // without iterator would print infinitely

            // PLACEMENT OF ITERATOR IN WHILE LOOP DOESNT CHANGE THE RESULT
        }

        System.out.println("=======================================");

        int num = 0;
        while (num < 100){
            if (num % 15 ==0){
                System.out.print(num+ " ");
            }
            num++;
        }


    }
}
