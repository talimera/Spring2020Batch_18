package JavaClasses.day30_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CombineTwoArrays {

    public static void main(String[] args) {

        /*
        write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <=arr1.length-1; i++){
            list.add(arr1[i]);
        }

        for (int i =0; i <arr2.length; i++){
            list.add(arr2[i]);
        }

        System.out.println(list);
    }
}
