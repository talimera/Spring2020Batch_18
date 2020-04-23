package JavaClasses.day09_NestedIf_Ternary;

public class Ternary2 {

    public static void main(String[] args) {

        String result = "";
        if(9>10){
            result ="9 is greater";
        } else {
            result ="10 is greater";
        }
        System.out.println(result);

        String result2 = (9>10) ? "9 is greater" : "10 is greater";

        System.out.println(result2);

        //====================================================\\

        int age = 44;
        boolean eligibility  ;
        if (age >=21){
            eligibility = true ;
        }else {
            eligibility = false;
        }

        boolean eligibility2 = (age >=21) ? true : false ;

        System.out.println(eligibility);
        System.out.println(eligibility2);


        //================================================\\

        int voterage = 20;
        String voting = "";

        if(voterage>=18){
            voting = "Yes";
        } else {
            voting = "No";
        }

        String voting2 = (voterage>=18) ? "Yes" : "No";

        System.out.println(voting);
        System.out.println(voting2);
    }
}
