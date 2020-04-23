package JavaClasses.day19_Arrays;

import java.util.Scanner;

public class StudentsPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] student = new String[10];

        String result = "";
        for (int i =0; i<=9; i++){

            System.out.println("Enter name");
            String  names = scan.next();

             student[i] = names;
             result += names+" ";

        }
        System.out.println(result);



    }
}
