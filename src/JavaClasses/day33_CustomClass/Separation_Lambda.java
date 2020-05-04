package JavaClasses.day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Separation_Lambda {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char[] arr = str.toCharArray();
        Character [] ch = new Character[arr.length];
        for (int i=0 ; i<arr.length; i++){
            ch[i] = arr[i];
        }

        System.out.println(Arrays.toString(ch));

        Predicate<Character> l = p -> !Character.isLetter(p);
        Predicate<Character> d = p -> !Character.isDigit(p);
        Predicate<Character> s = p -> Character.isDigit(p) || Character.isLetter(p);


        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(l);
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(d);
        System.out.println(digits);

        ArrayList<Character> specials = new ArrayList<>(Arrays.asList(ch));
        specials.removeIf(s);
        System.out.println(specials);



    }
}
