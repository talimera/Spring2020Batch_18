package JavaClasses.day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        switch(5){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:  // can be placed anywhere in switch statement and still will be executed last
                System.out.println("Invalid Case");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;


        }

    }
}
