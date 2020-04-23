package JavaClasses.day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods_Split {

    public static void main(String[] args) {

        // splits the strings and returns words as a string value.
        String str = "I like Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        // reversing the the sentence ==> day great is today
        String sentence = "Today is great day";
        String [] reverse = sentence.split(" ");

        for ( int i = reverse.length-1; i>=0; i--){
            String eachwords = reverse[i];
            System.out.print(eachwords+" ");
        }

        System.out.println();

        String str2 = "ABCD";
        String [] s1 = str2.split("");
        System.out.println(Arrays.toString(s1));

        int [] num1 =new int[3];
        int [] num2 = {1,2,3,4,5};
        num1 =num2;
        System.out.println(Arrays.toString(num1));

    }
}
