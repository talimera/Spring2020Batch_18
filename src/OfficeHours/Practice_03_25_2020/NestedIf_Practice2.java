package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {

    public static void main(String[] args) {
    /*
    PRECONDITIONS FOR NESTED IF STATEMENTS
    for the loan:
        if has a job that pays > 50000 ===> might be eligible
            if he/she has a good credit
                if experience is > 2 years
     */
        int salary = 55000;
        short creditscore = 550;
        byte experience = 1;

        if(salary>50000){
            if(creditscore>650){
                if(experience>=2){
                    System.out.println("You are qualified");
                }else{
                    System.out.println("You dont have required job history");
                }
            }else{
                System.out.println("You dont have a good credit score");
            }
        }else{
            System.out.println("You need to have a job that pays $50000");
        }


    }
}
