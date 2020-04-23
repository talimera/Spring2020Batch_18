package Repl_it;

import java.util.Scanner;

public class replit_065_MiddleThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();

        if(word.length()%2 !=0 && word.length()>=5){
            System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2)+word.charAt(word.length()/2+1));
        }else{
            System.out.println("invalid");
        }

    }
}
