package JavaClasses.day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,7,8,9,1,2,3,45,6));

        list.retainAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

    }
}
