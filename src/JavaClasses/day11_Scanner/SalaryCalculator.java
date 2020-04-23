package JavaClasses.day11_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Salary");
        int salary = input.nextInt();

        System.out.println("Please enter your State Tax Rate");
        double stateTax = input.nextDouble();

        System.out.println("Please enter your Federal Tax Rate");
        double federalTax= input.nextDouble();

        double salaryaftertax = salary *(1-(stateTax+federalTax));

        System.out.println("Your salary after tax cut is: "+ salaryaftertax);


    }
}
