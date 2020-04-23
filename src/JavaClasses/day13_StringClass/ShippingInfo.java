package JavaClasses.day13_StringClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
/*
write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public class ShippingInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number");
        String bnumber = input.next();

        input.nextLine();

        System.out.println("Please enter your street address");
        String street = input.nextLine();

        System.out.println("Please enter your city");
        String city = input.next();

        System.out.println("Please enter your state");
        String state = input.next();

        System.out.println("Please enter your Zipcode");
        int zip = input.nextInt();

        input.nextLine();
        System.out.println("Please enter your full name");
        String fullname = input.nextLine();

        System.out.println("Ship To: ");
        System.out.println(fullname+"\n"+bnumber+" "+street+"\n"+city+", "+state+" "+zip);




    }


}
