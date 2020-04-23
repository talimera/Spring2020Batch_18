package JavaClasses.day25_Methods_Recap;

import java.util.Scanner;

public class Driver {

    public static String getDriver1 (String browserName){
        String result ="";
        browserName = browserName.toLowerCase();
        switch(browserName){
            case ("chrome"):
                result = "Chrome";
                break;
            case ("safari"):
                result = "Safari";
                break;
            case ("opera"):
                result = "Opera";
                break;
            case ("edge"):
                result = "Edge";
                break;
            default:
                result = "Invalid";
                break;
        }
        return result;
    }

    // for loop inside of the switch statement ??????

    public static String getDriver2 (String browserName2){
        String result = "";
        browserName2 = browserName2.toLowerCase();

        if (browserName2=="chrome"){
            result = "Chrome Driver";
        }else if (browserName2=="firefox"){
            result = "Firefox Driver";
        }else if (browserName2=="edge"){
            result = "Edge Driver";
        }else if (browserName2 == "safari"){
            result = "Safari Driver";
        }else{
            result = "Invalid Driver";
        }

        return result;
    }

    public static String getDriver3 (String browserName3){
        String result ="";
        browserName3 = browserName3.toLowerCase();
        result = (browserName3=="chrome")? "Chrome Driver":(browserName3=="firefox")? "Firefox Driver": (browserName3=="safari")? "Safari Driver":
                (browserName3=="edge")? "Edge Driver" : "Invalid Driver";
        return result;
    }

    public static void main(String[] args) {

        /*
        1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your browser name");
        String str = getDriver1(scan.next());

        System.out.println(str);

        String str2 = getDriver2("firefox");
        System.out.println(str2);

        String str3 = getDriver3("safari");
        System.out.println(str3);






    }
}
