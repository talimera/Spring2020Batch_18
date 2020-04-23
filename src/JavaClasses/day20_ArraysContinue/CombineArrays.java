package JavaClasses.day20_ArraysContinue;

import java.util.Arrays;

public class CombineArrays {

    public static void main(String[] args) {

        int arr1 [] = {5,1,4};
        int arr2 [] = {11,41,56,121};

        int comb [] = new int [arr1.length+arr2.length];

        System.out.println(comb.length);

        int[] arr3 = new int[arr1.length+arr2.length];


        for (int i=0; i<arr3.length; i++){

            if (i>=0 && i<arr1.length){
                arr3[i] += arr1[i];
            }else if(arr1.length>=3 && i<arr3.length){
                arr3[i] += arr2[i-(arr2.length-1)];

            }

        }
        String result = Arrays.toString(arr3);
        System.out.println(result);

    }

}
