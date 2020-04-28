package JavaClasses.day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(7);
            list.add(8);

            list.add(1,6);
            list.set(3,9); // will replace index 3 which is number 8 !


        System.out.println(list);

        System.out.println("=================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(12);
        list2.add(4);
        list2.add(21);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);  list.add(51);   list.add(21);

        Integer a = 21;
        list.remove(1);
        boolean r1 = list.remove(a); // also returns boolean value !!!
        System.out.println(list3);
        System.out.println(r1);

    }
}
