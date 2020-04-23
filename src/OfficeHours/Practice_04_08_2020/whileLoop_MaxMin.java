package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class whileLoop_MaxMin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648 ;
        int min =  2147483647 ;

        int i =1;
        while (i<4){

            System.out.println("enter a number");
            int num1 = scan.nextInt();

            if (num1>max){ // whichever the input is larger , will be assigned to max
                max = num1;
            }

            if (num1<min){ // whichever the input smaller , will be assigned to min
                min = num1;
            }

            i++;
        }






    }
}
