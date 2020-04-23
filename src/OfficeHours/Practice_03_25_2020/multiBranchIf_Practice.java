package OfficeHours.Practice_03_25_2020;

public class multiBranchIf_Practice {

    public static void main(String[] args) {

        int number = 0;

        if(number>0){
            System.out.println(number +" is positive");
        }else if(number<0){
            System.out.println(number+ " is negative");
        }else{
            System.out.println(number+ " is zero");
        }

        int num1 = 100;
        int num2 = 200;

        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else if(num1<num2){
            System.out.println(num2+" is greater than "+num1);
        }else{
            System.out.println(num1+" is equal to "+num2);
        }

        //=====================================================\\
        // Testing the browsers

        String BrowserName = "Chrome";

        if(BrowserName=="Firefox"){
            System.out.println("Firefox browser is opening");
        }else if(BrowserName=="Chrome"){
            System.out.println("Chrome browser is opening");
        }else if(BrowserName=="Internet Explorer"){
            System.out.println("Internet Explorer browser is opening");
        }else{
            System.out.println("Invalid Browser Name");
        }
    }
}
