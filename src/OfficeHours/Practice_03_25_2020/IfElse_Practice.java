package OfficeHours.Practice_03_25_2020;

public class IfElse_Practice {

    public static void main(String[] args) {

        int num = 100;

        if(num%2 !=0){
            System.out.println(num+ " is an odd number");
        }else {
            System.out.println(num+" is an even number");
        }

        int age = 21;

        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are underage and not eligible to buy alcohol");
        }

        boolean genderMale = true;
        if(genderMale){
            System.out.println("Gender is male");
        }else{
            System.out.println("Gender is female");


        boolean usCitizen = true;
        int ageOfPerson = 30;

        if(usCitizen && ageOfPerson >=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

        }

    }
}
