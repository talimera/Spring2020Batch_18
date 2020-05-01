package JavaClasses.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        System.out.println("==============================");


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        Integer max1 = Collections.max(numbers);
        numbers.removeAll(Arrays.asList(max1));
        System.out.println(numbers);

        int secondmax = Collections.max(numbers);
        System.out.println(secondmax);

        System.out.println("======================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

        Integer minNum = Collections.min(list2);
        System.out.println(minNum);

        list2.removeAll(Arrays.asList(minNum));
        System.out.println(list2);

        minNum = Collections.min(list2);
        System.out.println(minNum);

    }
}
