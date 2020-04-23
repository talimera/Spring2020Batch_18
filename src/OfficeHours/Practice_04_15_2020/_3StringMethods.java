package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _3StringMethods {

    public static void main(String[] args) {

        /*
            toCharArray(); returns char Array
            split();
         */

        String str = "Cybertek";
        char [] ch1 = str.toCharArray();
        System.out.println(ch1);
        System.out.println(Arrays.toString(ch1));
        System.out.println(str.length()==ch1.length);

        System.out.println("---------------------------------");

        String str1 = "ABC";
        String str2 = "CBA";

        char [] ch2 = str1.toCharArray();
        char [] ch3 = str2.toCharArray();

        Arrays.sort(ch2);
        Arrays.sort(ch3);

        System.out.println(Arrays.equals(ch2,ch3));

        System.out.println("---------------------------------");

        String sentence = "I like to learn Java";
        String [] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int totalNumbers = words.length;
        System.out.println(totalNumbers);

        String result = "";
        String reverse [] = new String[words.length];
        for (int i =words.length-1; i>=0; i--){
            System.out.print(words[i]+" ");
            result +=  words[i]+" ";
        }
        System.out.println();
        result.trim();
        System.out.println(result);



    }
}
