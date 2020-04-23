package JavaClasses.day22_Arrays_Loops_Practice;

public class Count_odd_even {

    /*
    write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
     */

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8,9,10};

        int countodd = 0;
        int counteven = 0;

        for (int each : arr){
            if (each % 2 ==0){
                counteven++;
                continue;
            }
            countodd++;
        }

        /*for (int eachnum : arr){
            if (eachnum % 2 != 0){
                countodd++;
            }
            if (eachnum % 2 ==0){
                counteven++;
            }
        }
         */
        System.out.println(counteven);
        System.out.println(countodd);


    }
}
