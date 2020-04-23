package JavaClasses.day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWeather = true;
        if(coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("Wear your coat");
        }

        boolean coronaDetected = true;
        if(coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
            // cant execute certain one and left out others !!


        }

        //=====================================================================\\

        int a= 101;

        boolean evenNumber = a%2 == 0;
        boolean OddNumber = !evenNumber;
        if(evenNumber){
            System.out.println(a +" is an even number");

        }
        if(OddNumber){

            System.out.println(a+ " is an odd number");
        }


        /*int o = 101;

        boolean Oddnumber = o%2 !=0;
        if(Oddnumber){

            System.out.println(o+ " is an odd number");
        }
        */



    }

}
