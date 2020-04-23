package JavaClasses.day22_Arrays_Loops_Practice;

import java.util.Arrays;

public class Java_Python {

    public static void main(String[] args) {
    /*
           write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                    (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
            */
        String sentence = "I like java and javascript";
        sentence = sentence.toLowerCase(); // to provide case sensitivity
        int countjava = 0;
        int countpython = 0;
        String [] s1= sentence.split(" ");

        System.out.println(Arrays.toString(s1));

        for (String java : s1){


            if (java.contains("python")){ // if we switch the placement to first contains java then contains python count for python will be 2 instead 0 !!!!
                countpython++;
            }
            if (java.contains("java")){
                countjava++;
                java = java.replaceAll("java","python");
            }

            System.out.println(java);
    }
        System.out.println(countjava);
        System.out.println(countpython);

    }
}
