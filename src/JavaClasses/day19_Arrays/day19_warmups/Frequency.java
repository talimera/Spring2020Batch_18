package JavaClasses.day19_Arrays.day19_warmups;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        /*
        2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
         */

        String str = "adfahdfaveaefadsf";

        String result = "";
        String nonDuplicates = "";

        for (int i=0; i <=str.length()-1 ; i++){ // this loops removes all duplicates in the string !!

            if (!nonDuplicates.contains(""+str.charAt(i))){
                nonDuplicates += str.charAt(i);
            }
        }

        System.out.println(nonDuplicates);


        // count the total number of occurrence of each character from str

        for (int j=0 ; j<=nonDuplicates.length()-1; j++){
           char ch = nonDuplicates.charAt(j);
            int count = 0;
            for (int i = 0; i <=str.length()-1; i++){
                if (str.charAt(i)== ch){
                    count++;
                }
            }

            result += ""+ ch +count;
        }



        System.out.println(result);



    }
}
