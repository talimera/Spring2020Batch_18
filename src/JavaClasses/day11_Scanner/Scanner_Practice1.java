package JavaClasses.day11_Scanner;
/*
 1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Scanner_Practice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your First Name: ");
        String fname = input.next();
        System.out.println("Please enter your Last Name");
        String lname = input.next();

        String fullname = fname+" "+lname;


        System.out.println("Are you currently employed?");
        boolean employment = input.nextBoolean();


        double salary =0;
        if(employment==true) {
            System.out.println("Enter your salary");
            salary = input.nextDouble();
        }

        System.out.println("Full name is: "+fullname);
        System.out.println("Employeed: "+employment);
        System.out.println("Your salary is: $"+salary);


    }
}
