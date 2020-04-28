package JavaClasses.day30_ArrayList;

import java.util.ArrayList;

public class ArrayListUniques {

    public static void main(String[] args) {

        /*
        write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(1);


        ArrayList<Integer> Uniques = new ArrayList<>();

        for (int i = 0; i<list.size() ; i++){

            int count = 0;

            for (Integer each :list){
                if (each == list.get(i)){
                    count++;
                }
            }
            if (count==1){
                Uniques.add(list.get(i));
            }
        }

        System.out.println(Uniques);


    }


}
