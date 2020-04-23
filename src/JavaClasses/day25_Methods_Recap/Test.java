package JavaClasses.day25_Methods_Recap;

import Resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "asdfasvberkasjdfbsaltbakjvgsaflasvj";

        String removed = Library.RemoveDuplicates(str);
        System.out.println(removed);

        String str3 = "asdfkuasdvbsavxncvbuwetrqwg";
        String result = Library.FrequencyOfChars(str3);
        System.out.println(result);

    }
}
