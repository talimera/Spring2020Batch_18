package JavaClasses.day13_StringClass;

// import java.lang.package you dont write this. It is done automatically by Java

public class StringManipulations {

    public static void main(String[] args) {

        // charAt() method
        String str = "Cybertek";
        //            01234567 index numbers of each of those character
        char ch1 = str.charAt(6); // will return e
        System.out.println(ch1);
        System.out.println(ch1=='e'); // true

        // length() method
        int totallength = str.length();
        System.out.println(totallength);

        if(totallength >10); // to limit the character numbers for comments,tweets etc.

        String str2 ="Today is great day, Java is Fun";

        int maxindex = str2.length() - 1;
        System.out.println(maxindex);

        // concat(Variable or new string) method
        String s1 = "Cybertek";
                s1=s1.concat(" School"); // new value needs to assign to variable !!!
        System.out.println(s1);
        // System.out.println(s1.concat(" School")); other way to do concat() method without assigning to anything.

        String r1 = "Java is fun";
              r1 = r1.concat(", and it's easy");
        System.out.println(r1);

        // toLowerCase() method
        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        // toUpperCase() method
        String name2 = "cybertek";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        // trim() method
        String A1 = "\t\t\t\tToday is a great day"; // removes unusable spaces. even escape sequences !!!!!!
        A1 = A1.trim();
        System.out.println(A1);





    }

}
