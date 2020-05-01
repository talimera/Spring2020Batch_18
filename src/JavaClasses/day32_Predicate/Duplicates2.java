package JavaClasses.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("A","B","A","C","D","D"));

        ArrayList<String> result = new ArrayList<>();

        for (String each : list){

            int count = Collections.frequency(list,each);
            if (count>1){
                if (result.contains(each)){
                    continue;
                }
                result.add(each);
            }
        }
        System.out.println(result);
    }
}
