package Repl_it;

import java.util.Scanner;

public class replit_056_LaptopConfig {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price. If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 - add  $400 to the laptop price.
        Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price. If CPU type equals to i5, add  $250 to the laptop price.
        If CPU type equals to i7, add  $350 to the laptop price. Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type.
        There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution.
        There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
        Example:

        Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i7
        Display message: Select RAM size:
        input: 8
        Display message: Select storage type:
        input: SSD
        Display message: Enter memory size:
        input: 1000
        Display message: Enter screen resolution:
        input: 4K
        Display message: Laptop price is: $1050.0
         */

        /*
        double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
         */

        double price = 0;


        System.out.println("Select screen size");
        String screenType = scan.next();

        if(screenType.equals("13.3")){
            price += 200;
        }else if(screenType.equals("15.0")){
            price += 300;
        }else if(screenType.equals("17.3")){
            price += 400;
        }

        System.out.println("Select CPU type");
        String cpu = scan.next();
        cpu = cpu.toLowerCase();

        if (cpu.equals("i3")){
            price += 150;
        }else if (cpu.equals("i5")){
            price += 250;
        }else if (cpu.equals("i7")){
            price += 350;
        }

        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        price += ram * 50;

        System.out.println("Select storage Type:");
        String storageType = scan.next();
        storageType = storageType.toLowerCase();

        System.out.println("Enter Memory Size:");
        int memory = scan.nextInt();
        if(memory %500 ==0){
            if (storageType.equals("hdd")){
                price += (memory/500)*50;
            }else if (storageType.equals("ssd")){
                price += (memory/500)*100;
            }

        }else{
            System.out.println("Please enter correct memory");
        }

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        resolution = resolution.toUpperCase();

        if (resolution.equals("FULLHD")){
            price += 100;
        }else if (resolution.equals("4K")){
            price += 200;
        }

        System.out.println("Laptop price is: "+price);







    }
}
