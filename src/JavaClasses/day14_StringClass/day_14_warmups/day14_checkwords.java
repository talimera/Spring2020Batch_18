package JavaClasses.day14_StringClass.day_14_warmups;

import java.util.Scanner;

public class day14_checkwords {

    /*1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String f = scan.next();
        System.out.println("Enter your second word");
        String s = scan.next();
        System.out.println("Enter your third word");
        String t = scan.next();

        boolean same = f.length()==s.length() && s.length()==t.length();
        // boolean some = (f.length()==s.length() && s.length()!=t.length()) || (f.length()!=s.length() && s.length()==t.length()) || (f.length()==t.length() && s.length()!=t.length());
        boolean diff = f.length()!=s.length() && f.length()!=t.length() && s.length()!=t.length();

        if(same){
            System.out.println("All words are same length");
        }else if (diff){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }
    }
}
