package JavaClasses.day22_Arrays_Loops_Practice;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {

        // write a program that can reverse the array

        int [] arr = {1,2,3,4,5};
        int length = arr.length-1;

        for (int i=length; i>=0; i--){
          int reverse= arr[i];
            System.out.println(reverse);
        }

        int j = length;
        int [] arr2 =  new int[arr.length];
        for (int i=0; i<=length; i++){
            arr2 [i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
