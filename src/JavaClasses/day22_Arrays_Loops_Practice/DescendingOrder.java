package JavaClasses.day22_Arrays_Loops_Practice;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        //write a program that sort the array in descending order

        int [] arr ={10,12,43,453,-123,5,0};
        Arrays.sort(arr); // sorts it in ascending order

        System.out.println(Arrays.toString(arr));

        int[] reverse = new int[arr.length];

        int j= arr.length-1;

        for (int i = 0; i<=arr.length-1; i++){
            reverse[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(reverse));

    }
}
