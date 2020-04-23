package JavaClasses.day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {2,4,5,6};

        int [][] comb = {arr1,arr2};
        // System.out.println(Arrays.toString(comb[1]));

        //Arrays.deeptoString(arrayname) converts multidimensional array to string

        System.out.println(Arrays.deepToString(comb));

    }
}
