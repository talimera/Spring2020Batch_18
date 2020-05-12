package Repl_it;

import java.util.Scanner;

public class replit_069_Printhalftwice {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int num = word.length()/2;
        word = word.replace(word.substring(num),word.substring(0,num));
        System.out.println(word);
    }
}


