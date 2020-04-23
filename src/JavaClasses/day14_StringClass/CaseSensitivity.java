package JavaClasses.day14_StringClass;

public class CaseSensitivity {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result1 = gmail.equals(userInputGmail);
        boolean result2 = gmail.equalsIgnoreCase(userInputGmail);

        /*if(result1){
            System.out.println("Logged in");
        }else{
            System.out.println("Access denied");
        }

         */

        if(result2){
            System.out.println("Logged in");
        }


    }

}
