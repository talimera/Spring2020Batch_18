package JavaClasses.day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter status code");
        int statusCode = input.nextInt();

        //DOING IT WITH MULTI-BRANCH IF STATEMENTS AND SCANNER TOGETHER
        String result =" ";
        if(statusCode==200){
            result = "Ok";
        }else if(statusCode==201){
            result= "Created";
        }else if(statusCode==202){
            result= "Accepted";
        }else{
            result="Invalid Status Code";
        }

        System.out.println(result);

        // DOING IT WITH TERNARY
        String result2 =" ";
        result2 = (statusCode==200)? "Ok": (statusCode==201) ? "Created": (statusCode==202)? "Accepted":"Invalid Status Code" ;
        System.out.println(result2);


    }

}
