package JavaClasses.day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {

    public static void main(String[] args) {

        // a variable that can contain arrays

        /*
        n dimensional array must contain n-1 dimensional arrays
        ==================
        n = 2 dimensional array contains 1 dimensional arrays

        []

         */

        int [] arr = {1,2,3};

        int [][] arr2d = {arr, {1,2,3},{1,5123,5123}};

        System.out.println(arr2d.length);
        System.out.println(Arrays.toString(arr2d[1]));

        System.out.println(arr2d[1][2]);




    }
}
