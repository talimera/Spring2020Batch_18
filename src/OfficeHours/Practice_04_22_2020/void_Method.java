package OfficeHours.Practice_04_22_2020;

import java.util.Scanner;

public class void_Method {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        print();
        System.out.println("Please enter your age");
        System.out.println("Are you citizen of US? True/False");
        Eligibility(scan.nextInt(),scan.nextBoolean());

        System.out.println("Yo,Homey.How old are you?");
        SmokeWeed(scan.nextInt());

    }

    public static void print(){
        int i=0;
        while(i<10) {
            System.out.println("Hello world");
        i++;
        }

    }

    public static void Eligibility (int age, boolean citizenship){
        boolean eligibletoVote = age >=18 && citizenship == true;
        if (eligibletoVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }
    }

    public static void SmokeWeed (int age){
        if (age>=18){
            System.out.println("You are eligible to smoke");
        }else{
            System.out.println("You are under age restriction");
        }
    }

}
