package JavaClasses.day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each: list){
            if (result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println(result);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Integer [] numbers = {1,2,3,4,1,3,45,123,4};

        ArrayList<Integer> list1 = new ArrayList<>();

        for (Integer each : numbers){
            if (list1.contains(each)){
                continue;
            }
            list1.add(each);
        }
        System.out.println(list1);


    }
}
