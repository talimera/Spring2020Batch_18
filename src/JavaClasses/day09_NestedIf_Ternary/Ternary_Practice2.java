package JavaClasses.day09_NestedIf_Ternary;

public class Ternary_Practice2 {

    public static void main(String[] args) {

        int num1 = 300;
        int num2 = 200;
        int min = (num1 <num2) ? num1 : num2 ;

        System.out.println(min);


        //==================================\\

        int hour = 19 ;

        String result = (hour<=12) ? "Good Morning" : (hour>12 && hour<18)? "Good Afternoon" : "Good Evening" ;

        System.out.println(result);

        //=====================================\\

        int number = 12000;
        boolean div35= (number %15 ==0) ? true : false;

        System.out.println(div35);

        
    }
}
