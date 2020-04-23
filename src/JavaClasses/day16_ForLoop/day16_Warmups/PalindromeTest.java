package JavaClasses.day16_ForLoop.day16_Warmups;

import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.nextLine();

        String reverse = "";

        for (int x= word.length()-1; x>=0; x-- ){
            reverse += word.charAt(x);
        }

        boolean palendrome = reverse.equalsIgnoreCase(word);
        System.out.println(reverse +" and "+ word+ " are palendrome: "+ palendrome);

    }
}
