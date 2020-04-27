package JavaClasses.day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {

        public static void main(String[] args) {

            // Collections and Maps (Data Structures) dont support any primitives.
            // ArrayList being a part of collection will not support any primitives.

          //  Syntax ===>  ArrayList <DataType> listname = new ArrayList<DataType>();

            ArrayList <Integer> scores = new ArrayList<>(); // size by default is zero

            // HOW TO ADD TO ARRAYLIST
            // add() : adds Objects to the ArrayList

            scores.add(10); // Autoboxing - size became 1
            scores.add(20); // Autoboxing - size became 2
            scores.add(30); // Autoboxing - size became 3
            System.out.println(scores); // we dont need another method to print the ArrayList (like Arrays.toString() method)

            // HOW TO RETRIEVE AN OBJECT FROM ARRAYLIST
            // get() : retrieve Objects from given index number

            int a1 = scores.get(2);
            System.out.println(a1);
            double a2 = scores.get(1);
            System.out.println(a2);






    }
}
