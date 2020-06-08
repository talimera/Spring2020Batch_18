package JavaClasses.day40_Encapsulation;

public class CredentialsObject {


    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("talhameral");
        facebook.setPassWord("talimera");

        Credentials gmail = new Credentials();

        gmail.setUserName("talhameral@gmail.com");
        gmail.setPassWord("talimera123");

        System.out.println(gmail.getUserName());
        System.out.println(facebook.getPassWord());



    }
}
