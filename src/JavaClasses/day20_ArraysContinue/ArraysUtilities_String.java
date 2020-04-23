package JavaClasses.day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities_String {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        String arr1 = Arrays.toString(arr); // only for used for printing out the array values

        System.out.println(arr1);

        String names [] = {"tali","bali","retad"};

        System.out.println(Arrays.toString(names));

        double [] nums = {10,20,30,40,50};

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[1]+1); //21.0 - Addition

        /* write a program that can combine two arrays of any lengths , and return the combined third array */

    }
}
