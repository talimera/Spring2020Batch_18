package JavaClasses.day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        // wrapper classes can only be assigned their own class
        // ValueOf returns wrapper class
        String str = "123";

        Integer a = Integer.valueOf(str); // integer wrapper class , 123
        System.out.println(a);

        double b = Integer.valueOf(str);
        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2); // parse class will return primitive values

        double d2 = Double.valueOf(str2); // will return wrapper class
        //  double = Double // Unboxing

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1==d2);
        System.out.println("============================");
        int z1 = 2000;
        // Long L1 = z1; only accepts long value

        Short z2 = 2000;
        int b1 = z2;

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1);

        boolean t2 = Boolean.valueOf(r1);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("==========================");

        int maxNum = Integer.MAX_VALUE; // returns you the maximum value that can be assigned to given primitive
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE; // returns you the minimum value that can be assigned to given primitive
        System.out.println(minNum);

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);
        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        System.out.println("========================================");

        int [] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        boolean [] arrr = new boolean[3];
        System.out.println(Arrays.toString(arrr));

        /*
        default values of primitives
                byte,short,int,long = 0
                float,double = 0.0
                char : [] (empty box)
                boolean = false
        All of the wrapper classes default values are nulls !!!!


         */

        System.out.println("========================================");

        Boolean [] arr2 = new Boolean [3];
        System.out.println(Arrays.toString(arr2));

        Character [] arr3 = new Character[3];
        System.out.println(Arrays.toString(arr3));

        Integer [] arr4 = new Integer [3];
        System.out.println(Arrays.toString(arr4));


    }
}