package JavaClasses.day20_ArraysContinue;

import java.util.Arrays;

public class Array_toCharArray {

    public static void main(String[] args) {

        String str = "batch 18";

            char [] ch =str.toCharArray();

        System.out.println(Arrays.toString(ch));

        String name = "sulti";

        char [] ch1 = name.toCharArray();
        System.out.println(Arrays.toString(ch1));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char [] s1 = str1.toCharArray();
        char [] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        
        System.out.println(Arrays.equals(s1,s2));

    }
}
