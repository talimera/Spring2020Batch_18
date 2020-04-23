package JavaClasses.day20_ArraysContinue;

import java.util.Arrays;

public class ArrayUtilities_Equals {

    public static void main(String[] args) {

        int [] arr1 = {1,12,4,1,5};
        int [] arr2 = {1,12,4,5,1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        boolean x = Arrays.equals(arr1,arr2);
        System.out.println(x);
    }

}
