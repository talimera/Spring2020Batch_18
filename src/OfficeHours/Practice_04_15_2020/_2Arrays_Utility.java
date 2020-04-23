package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _2Arrays_Utility {
    /*

        Arrays.sort(): sorts the array in Ascending order
        Array.equal(): checks if two arrays are equal or not
        Arrays.toString(): converts single dimensional to string
        Arrays.deepToString(): converts multi dimensional array to string

     */

    public static void main(String[] args) {

        int [] arr = {21,1231,214,5325,643631};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------");

        // Arrays.equal();

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};

        System.out.println(Arrays.equals(arr1,arr2));



    }
}
