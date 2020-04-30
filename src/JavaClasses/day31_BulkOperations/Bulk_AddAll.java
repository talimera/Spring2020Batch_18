package JavaClasses.day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        //add 30-21-40-50-45-35-200
        // addAll only accepts Data Collection Type

        list1.addAll(Arrays.asList(30,21,40,50,45,35,200));
        System.out.println(list1);

        String [] names = {"Muhtar","Murtaza","Muhesong","Sada"};

        // names [5] = "Osman";

        System.out.println(Arrays.toString(names));

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(names));
        System.out.println(list2);

        list2.add("Osman");
        System.out.println(list2);
        list2.remove("Osman");
        System.out.println(list2);

        System.out.println("==========================================");

        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numlist = new ArrayList<Integer>(Arrays.asList(numbers));
        System.out.println(numlist);

    }
}
