package JavaClasses.day33_CustomClass;

import java.util.ArrayList;

public class Separation2 {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

        for (int i = 0; i<str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
                letters.add(str.charAt(i));
            }else if (Character.isDigit(str.charAt(i))){
                digits.add(str.charAt(i));
            }else{
                specials.add(str.charAt(i));
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specials);


    }
}
