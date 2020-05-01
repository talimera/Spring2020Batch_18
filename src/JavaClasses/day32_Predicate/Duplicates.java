package JavaClasses.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {

        /*
        warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
         */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","B","C","C","D"));
        System.out.println(list);

        ArrayList<String> duplicates =new ArrayList<>();

        for (int i = 0; i<list.size(); i++){
        int count = 0;
        for (String each: list){
            if (each.equals(list.get(i))){
                count++;
            }
        }
        if (count>1&& !duplicates.contains(list.get(i))){
            duplicates.add(list.get(i));

        }

        }

        System.out.println(duplicates);
    }
}
