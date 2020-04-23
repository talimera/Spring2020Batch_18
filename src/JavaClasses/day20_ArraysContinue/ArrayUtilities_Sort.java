package JavaClasses.day20_ArraysContinue;

import java.util.Arrays;

public class ArrayUtilities_Sort {

    public static void main(String[] args) {

        int arr [] = {6,5,3,12,4,12};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        char [] ch = { 'a', 'b', 'z', 'd','e'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String [] names = {"deniz","retad","kamil","tali"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int arr1 [] = {3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr1);
        int des []= new int[arr1.length];
        System.out.println(Arrays.toString(arr1));

        int j = 0;
        for (int i = arr1.length-1; i>=0 ; i--) {
            des[j] = arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(des));

    }
}
