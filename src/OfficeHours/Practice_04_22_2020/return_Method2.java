package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {

    // write a method that can return the second maximum number from any given array

    public static void main(String[] args) {

        int [] arr = {421,12321,5235,21,231};
        int a = SecondMax(arr);
        System.out.println(a);

    }

    public static int SecondMax (int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }


}
