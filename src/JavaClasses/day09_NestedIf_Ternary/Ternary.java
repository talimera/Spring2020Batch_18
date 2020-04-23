package JavaClasses.day09_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {
        int num = 100;

        String Result = "";

        if(num %2 ==0){
            Result ="Even";
        }else {
            Result = "Odd";
        }

        // if the if statement is only returning value and assigning it to variable then we can apply ternary

        // in ternary : ? means if, : means else keyword

        String result = (num %2 ==0) ? "Even" : "Odd" ;

        System.out.println(result);


        //======================================================\\

        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if ( num1 >num2){
            max = num1;
        }else {
            max = num2;
        }

        int max2 = (num1>num2) ? max2 = num1 : num2;
        System.out.println(max2);

        //==========================================================\\
        String str ="";
        if(true) {
            str = "Hello";
        } else {
            str ="Hola";
        }

        String str2 = (true) ? "Hello" : "Hola";

        System.out.println(str2);








    }
}
