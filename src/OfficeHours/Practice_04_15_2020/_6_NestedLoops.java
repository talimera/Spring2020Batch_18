package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _6_NestedLoops {

    public static void main(String[] args) {

        char [][] arr2D = {{'a','b'},{'d','e','g'},{'p','x','c'}};

        for (int i=0 ; i<arr2D.length; i++){
            for (int k =0 ; k < arr2D[i].length;k++ ){
                System.out.print(arr2D[i][k]+" ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------");

        for (char[] eachletter : arr2D){
            //System.out.println(Arrays.toString(eachletter));
            for (char each: eachletter){
                System.out.print(each+" ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------");


    }
}
