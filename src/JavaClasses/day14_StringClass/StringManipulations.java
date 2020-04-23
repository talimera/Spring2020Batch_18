package JavaClasses.day14_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        String str = "I like to learn Java.I like to watch the movie Jumanji";

        int a1 = str.indexOf("J"); // returns the index num of first matching one
        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        String s = "I like Java, and I like reading";

        int a3 = s.lastIndexOf("I");
        System.out.println(a3);




    }



}
