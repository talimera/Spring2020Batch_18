package JavaClasses.day13_StringClass;

public class StringManipulations_2 {

    public static void main(String[] args) {

        String str = "Cybertek School is the best";

        String schoolName= str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0,6);
        String lastname = fullName.substring(7,12);

        System.out.println(firstName);
        System.out.println(lastname);

        // full nema = firstname  lastname
        // gmail lastname_firstname@gmail.com

        String  Murtaza = "Murtaza Nazeeri";
        String  first = Murtaza.substring(0,7);
        String last = Murtaza.substring(8,15);
        String gmail = first+"_"+last+"@gmail.com";

        String gmail1 = last.concat("_").concat(first).concat("@gmail.com");
        System.out.println(gmail);
        System.out.println(gmail1);

        String s1 = "I love Java Programming Language";

        String className= s1.substring(7); // in this format creates substring from beginning to the end
        System.out.println(className);


        String s2 = "I like C# Programming";
                s2=s2.replace("C#","Java");
        System.out.println(s2);

        String name = "COVID 18";
            name=name.replace("18","19");
        System.out.println(name);

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);


    }

}
