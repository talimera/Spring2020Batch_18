package JavaClasses.day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i =1; i<=5; i++){
            System.out.println("Hello World");
            break;
        }

        System.out.println("======================================");

        for (int s =1; s<=5; s++){
            System.out.println("Hello World");
            if(s==3){
                break;
            }

        }


    }
}
