package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1,23);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("===================================");
        ArrayList<String> list2 = new ArrayList<>();
                list2.add("a");
                list2.add("B");
                list2.add("F");
                list2.add("g");
        System.out.println(list2);
                list2.add(2,"r");
        System.out.println(list2);
    }
}
