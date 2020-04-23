package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _1Single_Dimensional_Arrays {

    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100,200,300};
        System.out.println(arr[1]);

        for (int i = 0; i<arr.length; i++){
            int eachnum = arr[i];
            System.out.println(eachnum);
        }
        System.out.println("---------------------------------");

        int i=0;
        while (i<arr.length){
            int each = arr[i]; i++;
            System.out.println(each);
        }

        System.out.println("---------------------------------");

        String [] names = {"John","Aaron","Louise"};
        String [] reverse = new String[names.length];
        int j = 0;
        for (int b = names.length-1; b >= 0; b--){
            reverse[j]=names[b];
            j++;
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------------------");


    }
}
