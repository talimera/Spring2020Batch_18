package JavaClasses.day25_Methods_Recap;

import Resources.Library;

public class FrequencyofCharacters {

    public static void main(String[] args) {

        String str = "AABBCC";

        String nonDup = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i< nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }



    }

    public static String FrequencyOfChars (String str){
        String nonDup = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i< nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }
        return result;
    }




}
