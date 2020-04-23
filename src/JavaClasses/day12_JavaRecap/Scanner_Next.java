package JavaClasses.day12_JavaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      //  String str = input.next(); // only takes the first word
      //  System.out.println(str);

        String fullAdress ="";

        System.out.println("Enter the number of the building");
            short Bnumber = input.nextShort();
            fullAdress += Bnumber+" ";

        System.out.println("Enter the Street Name");

        String streetname = input.next();
        fullAdress += streetname+" ";

        System.out.println("Enter the type of the road");
        String roadtype = input.next();
        fullAdress +=roadtype+", ";

        System.out.println("Enter your City Name");
        String city = input.next();
        fullAdress += city+" ";

        System.out.println("Enter your Abbreviated version of your state name");
        String state = input.next();
        fullAdress += state+", ";

        System.out.println("Enter your Zip Code");
        int zip = input.nextInt();
        fullAdress +=zip;

        System.out.println("Your Adress is: "+fullAdress);



    }

}
