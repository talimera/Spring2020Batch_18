package OfficeHours.Practice_04_08_2020;

public class nestedLoop_Practice {

    public static void main(String[] args) {

        /*

            nested loop: loop inside another loop
                            inner & outer loop

            we only need them when we need to repeat a loop


         */

        int j = 5;
        while (j<10){

            for (int i = 10; i<=50; i+=10){
                System.out.print(i+" ");
            }

            System.out.println();
            j++;
        }

        System.out.println("---------------------------------------------");


        int a = 1;
        while (a<9){
            for (int i=1; i<=6; i++){
                System.out.print("* ");
            }
            System.out.println();
            a++;
        }

        System.out.println("---------------------------------------------");

        while (a<7){
            for (int i=1; i<=a; i++){
                System.out.print("* ");
            }
            System.out.println();
            a++;
        }
        

    }
}
