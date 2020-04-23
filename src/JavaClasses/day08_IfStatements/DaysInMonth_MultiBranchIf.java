package JavaClasses.day08_IfStatements;

public class DaysInMonth_MultiBranchIf {

    public static void main(String[] args) {

        byte months = 13;

        String result = " ";

        if(months ==1){
            result = "January has 31 days";
        }else if ( months==2){
            result = "February has 28 days";
        }else if (months==3){
            result = "March has a 31 days";
        }else if(months==4){
            result = "April has a 30 days";
        }else if(months==5){
            result ="<May has a 31 days";
        }else if(months==6){
            result ="June has a 30 days";
        }else if(months==7){
            result ="July has a 31 days";
        }else if(months==8){
            result ="August has a 31 days";
        }else if(months==9){
            result="September has 30 days";
        }else if(months==10){
            result="October has a 31 days";
        }else if(months==11){
            result="November has a 30 days";
        }else if(months==12){
            result="December has a 31 days";
        }else{
            result="Invalid Entry";
        }

        System.out.println(result);


    }
}
