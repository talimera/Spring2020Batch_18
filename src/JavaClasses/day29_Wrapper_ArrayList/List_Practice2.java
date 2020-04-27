package JavaClasses.day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(123);
        numbers.add(12453215);
        numbers.add(212345);
        numbers.add(1234543);
        numbers.add(12);

        Integer max = Integer.MIN_VALUE;

        for (Integer each: numbers){
            if (each>max){
                max = each;
            }
        }

        System.out.println(max);
        System.out.println("=============================================");
        MaxArrayList(numbers);
    }

    public static void MaxArrayList (ArrayList<Integer> list){
        Integer max = Integer.MIN_VALUE;

        for (Integer each: list){
            if (each>max){
                max = each;
            }
        }

        System.out.println(max);


    }
}
