package Repl_it;

import java.util.Scanner;

public class replit_051_TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Write your code inside the method.
                    Use the values given as method parameters.
                    Assign final values.
                    Then user should select service quality that will correspond to tip percent.
                    Poor = 5%
                    Fair = 10%
                    Good = 15%
                    Great = 20%
                    Excellent = 25%
                    The program should display the following information based on the user input:
                    Split or No split
                    Number of people entered: &&&&
                    Service Quality:
                    Total to pay:
                    Total tip:
                    Total per person:
                    Tip per person:
                    https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

                    Input:
                    Split:Yes
                    Number of people:4
                    Check amount:476.0
                    Service Quality:Excellent

                    Output:

                    Number of people entered: &&&&
                    Total to pay: 595.0
                    Total tip: 119.0
                    Total per person: 148.75
                    Tip per person: 29.75
         */
        System.out.println("Do you want to split?");
        String split= scan.next();

        System.out.println("How many people?");
        int person = scan.nextInt();

        System.out.println("Your Check Amount");
        double check = scan.nextDouble();

        System.out.println("How was the service quality?");
        String quality = scan.next();

        double tip = quality.equalsIgnoreCase("Excellent")? 0.25: quality.equalsIgnoreCase("Great") ? 0.2: quality.equalsIgnoreCase("Good")? 0.15: quality.equalsIgnoreCase("Fair") ? 0.1 :
                quality.equalsIgnoreCase("poor") ? 0.05: 0 ;

        double totaltip = check * tip;
        double totalAmount = check+totaltip;
        double perperson = totalAmount/person;
        double pertip = totaltip/person;

        String entry = (person == 1)? "&": (person==2)? "&&": (person==3)? "&&&": (person==4)? "&&&&": (person==5)? "&&&&&": "";


        String report = "Number of people entered: "+entry+ "\nTotal to pay: "+totalAmount+"\nTotal tip: "+totaltip+"\nTotal per person: "+perperson+"\nTip per person: "+pertip;
        String oneper = "Number of people entered: "+entry+ "\nTotal to pay: "+totalAmount+"\nTotal tip: "+totaltip;

        if(person>1){
            if (split.equalsIgnoreCase("split") || split.equalsIgnoreCase("yes")) {
                System.out.println(report);
            }

        }else{
            System.out.println(oneper);
        }











    }

}
