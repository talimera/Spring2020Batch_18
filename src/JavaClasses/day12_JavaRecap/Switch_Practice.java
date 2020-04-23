package JavaClasses.day12_JavaRecap;

public class Switch_Practice {

    public static void main(String[] args) {

        switch(3){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default: // can be placed any place within switch
                System.out.println("Invalil Case Number");
            // there is no need to give break statement at the end of the switch but giving it will get rid of any logical errors
        }

        //==========================================================\\
        // boolean, long, double and float are not accepted in switch statements
        int statusCode = 404;
        String result ="";

        switch(statusCode){

            case 200:
                System.out.println("Ok");
                // result = "Ok"
                break;
            case 201:
                System.out.println("Created");
                // result = "Created"
                break;
            case 202:
                System.out.println("Accepted");
                // result = "Accepted"
                break;
            default:
                System.out.println("Invalid Status Code");
                // result= "Invalid Status Code"
                break;


        }

        //System.out.println(result); =======> way of doing the switch with Strings.



    }

}
