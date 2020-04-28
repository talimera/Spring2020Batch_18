package JavaClasses.day30_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Reversed {

    public static void main(String[] args) {

        /*
        write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
         */

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i<6; i++){
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> reversedlist = new ArrayList<>();

        for (int i = list.size()-1; i>=0 ; i--){

           reversedlist.add(list.get(i));
           System.out.print(list.get(i)+" ");

        }

        System.out.println();
        System.out.println(reversedlist);
    }
}
