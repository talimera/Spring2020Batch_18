package JavaClasses.day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");

            list.remove(1); // B will be removed
        boolean a=list.remove("B");

        System.out.println(list);
        System.out.println(a);

        list.clear();
        // clear(): remove everything from the ArrayList
        System.out.println(list);

    }
}
