package JavaClasses.day09_NestedIf_Ternary;

public class Loan_NestedIf {

    public static void main(String[] args) {

        double salary = 30000;
        byte workHistory = 1;

        if(salary >= 30000){

            if(workHistory>=2){
                System.out.println("You are qualified for loan");
            }else {
                System.out.println("You must have been on job at least 2 years");
            }
        }else {
            System.out.println("You must earn 30000 to be qualified for loan");
        }

    }
}
