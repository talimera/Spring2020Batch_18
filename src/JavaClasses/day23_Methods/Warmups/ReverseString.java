package JavaClasses.day23_Methods.Warmups;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide your word");
        Reversal(scan.next());

    }

    public static void Reversal (String Reverse){
        String reverse = "";
        for (int i= Reverse.length()-1; i >=0; i--){
            reverse += Reverse.charAt(i);
        }
        System.out.println(reverse);

    }
}
