package JavaClasses.day18_NestedLoop;

public class NestedLoop {


    public static void main(String[] args) {


        for (int i=1;i<=4; i++){
            for (int s=1; s<=5; s++){
                System.out.print("Hello");
            }
            System.out.println();
        }


        for (int j=0; j<5; j++){

            for (int i=1; i<=5;i++){
                System.out.print(i+", ");

            }
            System.out.println();
        }

        for (int i=1; i<=7; i++){
            for (int l=1; l<=6;l++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


