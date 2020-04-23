package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {

    public static void main(String[] args) {

        byte weekDays = 2;

        boolean validNumber = weekDays>0 && weekDays<8;
        String day = "";
        if(validNumber){
            if(weekDays==1){
                day = "Today is Monday";
            }else if(weekDays==2){
                day= "Today is Tuesday";
            }else if(weekDays==3){
                day= "Today is Wednesday";
            }else if(weekDays==4){
                day= "Today is Thursday";
            }else if(weekDays==5){
                day= "Today is Friday";
            }else if(weekDays==6){
                day= "Today is Saturday";
            }else{
                day="Today is Sunday";
            }
        }else{
            System.out.println("Invalid Entry");
        }

        System.out.println(day);

    }
}
