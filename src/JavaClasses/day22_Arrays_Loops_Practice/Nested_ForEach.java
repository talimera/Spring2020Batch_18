package JavaClasses.day22_Arrays_Loops_Practice;

import java.util.Arrays;

public class Nested_ForEach {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        for (int each: arr){
            System.out.println(each);
        }

        int [][] arr2 = {{1,2,3},{4,5,6}};

        for (int[] eacharray :arr2){
        //    System.out.println(Arrays.toString(eacharray));
            for (int elements :eacharray){
                System.out.print(elements+" ");
            }

        }
        System.out.println();
        System.out.println("---------------------------------------");

        char [][] ch2d = {{'A','B'},{'C','D'},{'E','F','G'}};

        for (char [] ChARR : ch2d ){
            for (char singleChar : ChARR){
                System.out.print(singleChar+" ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");



    }
}
