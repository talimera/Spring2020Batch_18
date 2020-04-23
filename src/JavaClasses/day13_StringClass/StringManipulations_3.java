package JavaClasses.day13_StringClass;

public class StringManipulations_3 {

    public static void main(String[] args) {

        String str = "I like Java programming";
                int num= str.indexOf("va"); // we are allow to give string but it will only give the index number of first character
        System.out.println(num);

        String str2 = "Cybertek school is awesome";

        int firsts = str2.indexOf("is");
        System.out.println(firsts);

    }

}
