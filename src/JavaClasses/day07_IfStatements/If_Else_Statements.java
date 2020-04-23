package JavaClasses.day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = -1;

        if (number >= 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }

        int n2 = 79;
        boolean evenNum = n2 % 2 == 0;
        if(evenNum){
            System.out.println(n2+ "is even number");
        } else {
            System.out.println(n2+ " is odd number");
        }


        int age =  30;

        boolean adult = age >= 21;
        if(adult){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }


        boolean testedPositiveForCorona = true;

        if(testedPositiveForCorona){
            System.out.println("Buy more toilet paper and stay home");
        } else {
            System.out.println("Do more coding");
        }



    }
}
