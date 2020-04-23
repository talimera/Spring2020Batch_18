package JavaClasses.day14_StringClass;

public class StringManipulations3 {

    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2)); // false because equals() doesnt ignore case sensitivity

        System.out.println(str1.equalsIgnoreCase(str2)); // true because equalsIgnoreCase() method ignores the case sensitivity

        String s1 = "Cybertek School";

        boolean r1 = s1.contains("School");
        System.out.println(r1);


        /*
        valid password MUST contain a special character such as (!, _ , $)
        valid password should not contain spaces
         */

        String password = "mmasd1235 ";

        if(password.contains(" ")){
            System.out.println("Password cannot have a space in it");
        }else{
            System.out.println("valid password");
        }


        String a3 = "United States";

        System.out.println(a3.startsWith("U")); // true and this method case sensitive too.


        /*
        every website has "www." at the beginning of the web adress
         */

        String webAdress = "www.amazon.com";
                webAdress= webAdress.toLowerCase();
        if(webAdress.startsWith("www.")){  // can use contains() too but most likely will get logical error
            System.out.println("valid");
        }else{
            System.out.println("invalid entry");
        }

        String s4 = "Cybertek School";

        System.out.println(s4.endsWith("l"));

        String email = "CybertekSchool@yahoo.com";
        email = email.toLowerCase();

        if(email.endsWith("gmail.com")){
            System.out.println("Valid gmail address");
        }else{
            System.out.println("Not gmail address");
        }

        /* write a program that can validate if the web address is valid
                requirement
                    must starts with www.
                    must ends with .com or .edu .net .gov
         */






    }

}
