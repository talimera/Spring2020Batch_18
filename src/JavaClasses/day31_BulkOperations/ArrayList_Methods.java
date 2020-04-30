package JavaClasses.day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
                list1.add("A");
                list1.add("B");
                list1.add("C");
                list1.add("D");

         boolean r1 = list1.contains("C");
        System.out.println(r1);

         ArrayList<String> list2 = new ArrayList<>();
                list2.add("A");
                list2.add("B");
                list2.add("D");
                list2.add("C");
        boolean r2 = list1.equals(list2);
        System.out.println(r2);

        // sort method for ArrayList
        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("===================================");

        ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(10);
            list3.add(14);
            list3.add(56);
            list3.add(89);

            Collections.sort(list3);
        System.out.println(list3);

        ArrayList<Integer> reversedlist = new ArrayList<>();
        for (int i = list3.size()-1; i>=0; i--){
            reversedlist.add(list3.get(i));
            System.out.println(list3.get(i));
        }
        System.out.println(reversedlist);

        boolean r3 = list3.isEmpty();
        System.out.println(r3);
        list3.clear();
        boolean r4 = list3.isEmpty();
        System.out.println(r4);

    }
}
