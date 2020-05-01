package JavaClasses.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MovingZeroes {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(12,1241,52,0,0,3,0,2,5,8));

            int count = Collections.frequency(list,0);

            list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for (int i =0 ; i<count; i++){
            list.add(0);
        }

        System.out.println(list);


    }
}
