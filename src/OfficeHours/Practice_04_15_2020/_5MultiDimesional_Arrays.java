package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _5MultiDimesional_Arrays {

    public static void main(String[] args) {

        int [] arr1d = {1,2,3};

        int [][] arr2d ={arr1d,{2,3,4,5}};

        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println((arr2d[1][3]));


    }
}
