package JavaClasses.day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

            list1.add(10);
            list1.add(20);
            list1.add(30);
            list1.add(40);

            // Arrays.asList                       //Collection Type
            boolean result1 = list1.containsAll(Arrays.asList(30,40));
        System.out.println(result1);

        Integer [] data = {10,30,40};
        boolean r2= list1.containsAll(Arrays.asList(data));
        System.out.println(r2);
    }
}
