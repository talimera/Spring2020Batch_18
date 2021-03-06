package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        /*
                      i        j
               RevArr[0] = arr[3]
               RevArr[1] = arr[2]
               RevArr[2] = arr[1];
               RevArr[3] = arr[0];
         */

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse2(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    public static String RemoveDuplicates (String str) {

        String result = "";

        for (int i = 0; i<str.length(); i++){
            if (!result.contains(""+str.charAt(i))){
                result +=""+ str.charAt(i);
            }
        }

        return result;

    }

    public static int Frequency (String str1 ,String str2){
        int count =0;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }

        return count;
    }

    public static String FrequencyOfChars (String str){
        String nonDup = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i< nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            result += ch+num+" ";
        }
        return result;
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
