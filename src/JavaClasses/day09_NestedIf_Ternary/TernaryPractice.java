package JavaClasses.day09_NestedIf_Ternary;

public class TernaryPractice {

    public static void main(String[] args) {

        char ch1 = '+';
        int number = 50;
        if(number>0){
            ch1 = '+';
        }else if (number <0){
            ch1 = '-';
        }else {
            ch1 = '0';
        }
        System.out.println(ch1);

        char ch2 = (number>0) ? '+' : (number <0)? '-' : '0';
        System.out.println(ch2);


        //=========================================================\\

        byte score = 80;
        String Grades ="";

        if(score>=90 && score <=100){
            Grades = "A";
        }else if (score >=80 && score <= 89){
            Grades= "B";
        }else if(score >=70 && score <80){
            Grades = "C";
        }else if(score >=60 &&  score<70){
            Grades = "D";
        }else if (score <0 && score>0) {
            Grades = "Failed";
        }else{
            Grades = "Invalid Entry";
        }
        System.out.println(Grades);

        String Grades2 = (score>=90 && score <=100) ? "A" : (score >=80 && score <= 89) ? "B" :
                (score >=70 && score <80) ? "C" :  (score >=60 &&  score<70) ? "D" : (score <0 && score>0) ? "Failed" : "Invalid Entry";

        System.out.println(Grades2);



    }
}
