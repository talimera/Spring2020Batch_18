package JavaClasses.day10_Switch_Scanner;
/*
write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */
import java.util.Scanner;

public class rateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Salary:$ ");

        int salary = input.nextInt();

        System.out.println("Please enter your weekly hours");

        byte hours = input.nextByte();

        int yearlyhours = hours*52;

        int hourlyrate = salary/yearlyhours;

        System.out.println("Your hourly rate is $"+hourlyrate);
    }
}
