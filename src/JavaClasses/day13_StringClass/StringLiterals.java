package JavaClasses.day13_StringClass;

public class StringLiterals {

    public static void main(String[] args) {

        String str = "Cat";
        String str2= new String("Cat"); // memory stored in Java Heap

        System.out.println(str);
        System.out.println(str2);

        System.out.println(str==str2); // two different objects so it is false

        String str3 = "Cat";

        System.out.println(str==str3); // true because they are from string pool and use same object

        String str4 = new String("Cat");
        System.out.println(str4==str2); // two independent object so it will give us false

        String s1 = "Java"; // Goes to String Pool. immutable we cannot modify it.
        s1 = "Javascript"; // new object will be created in String Pool
        System.out.println(s1); // Javascript
    }
}
