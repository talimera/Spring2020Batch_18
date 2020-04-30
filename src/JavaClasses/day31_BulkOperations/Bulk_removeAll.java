package JavaClasses.day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bulk_removeAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,3,4,5,67,12));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        list.removeAll(Arrays.asList(1,3,5));
        System.out.println(list);

        System.out.println("=====================================");

        String [] names = {"Ahmed", "John","Aaron","Ahmed","Daniel"};

        ArrayList<String> namelist = new ArrayList<String>(Arrays.asList(names));
        System.out.println(namelist);

        namelist.removeAll(Arrays.asList("Ahmed"));
        System.out.println(namelist);


    }
}
