package JavaClasses.day07_IfStatements;

public class Vote {

    public static void main(String[] args) {

        int age = 16;
        boolean citizen = true ;

        boolean eligible = age >= 18 && citizen == true;

        if(eligible){
            System.out.println("You are eligible to vote.");
        }

        if(!eligible){
            System.out.println("You are not eligible to vote");
        }
    }

}
