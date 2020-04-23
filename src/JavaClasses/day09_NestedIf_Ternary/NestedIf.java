package JavaClasses.day09_NestedIf_Ternary;

public class NestedIf {

    public static void main(String[] args) {

        int age =15;
        boolean UScitizen = true;

        if(UScitizen){

            if(age>17){
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You must be 18 or older to be able to vote");
            }
        } else {
            System.out.println("Only the US citizens are eligible to vote");
        }
        //===============================================\\

        int score =101;
        String grade = "";

        if(score >=0 && score <=100){

            if(score>=90){
                grade = "A";
            }else if (score >=80){
                grade = "B";
            }else if (score >=70){
                grade = "C";
            }else if(score>= 60){
                grade = "D";
            }else {
                grade = "Failed";
            }

        }else{
            grade = "Invalid";
        }

        System.out.println(grade);


        String grade2 = "";

        if(score >=0 && score <=100) {

            grade2 = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "Failed";
        }else {
            grade2 = "Invalid";
        }
        System.out.println(grade2);






    }
}
