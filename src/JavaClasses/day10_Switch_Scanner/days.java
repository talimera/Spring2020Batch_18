package JavaClasses.day10_Switch_Scanner;

public class days {
/*
    write a program that can display the days based on the numbers 1 ~ 7
    MUST USE TERNARY

    precondition : valid number for the day
 */

    public static void main(String[] args) {

        int num = 7;
        String result = "";

        if(num>=1 && num <=7){

            result = (num ==1) ? "Monday": (num ==2) ? "Tuesday": (num==3)? "Wednesday": (num==4)? "Thursday":
                    (num==5)? "Friday": (num==6)? "Saturday": "Sunday";

        }else{
            result = "Invalid Entry";
        }
        System.out.println(result);

    }
}
