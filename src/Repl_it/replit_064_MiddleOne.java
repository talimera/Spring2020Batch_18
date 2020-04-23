package Repl_it;

import java.util.Scanner;

public class replit_064_MiddleOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();

        if(word.length()%2 !=0){
            if(word.length()>=3){
                System.out.println(word.charAt((word.length()-1)/2));
            }else if(word.length()==1){
                System.out.println(word+word+word);
            }
        }
        if(word.length()%2 ==0){
            if(word.length()>=4){
                System.out.println(word.substring((word.length()-1)/2,(word.length()-1)/2+2));
            }else if(word.length()==2){
                System.out.println(word+word);
            }
        }

    }

}
