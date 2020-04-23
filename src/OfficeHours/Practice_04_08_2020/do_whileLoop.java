package OfficeHours.Practice_04_08_2020;

public class do_whileLoop {

    public  static void main(String[] args) {

        /*
                    do{

                        statements;  // will be executed at least once even if the condition is false

                      } while(condition);

                      execution order;
                      1- statements;
                      2- condition
                            if true: repeats step 1
                            if false: breaks the loop

         */
                boolean b = 9<0;
                while (b){   // if statement is false right from start compiler wont execute and give you an error " unreacheble statement " due to automatic nature of Java's design(Smart Java!)
                System.out.println("false");
                    }

                do {
                    System.out.println("Hello Cybertek");
                }while (b);


                System.out.println("=========================");

                int j = 0;

                do {
                    if (j%15 == 0) {
                        System.out.print(j + " ");
                    }

                    j++;

                }while ( j <= 100);

        System.out.println();

        System.out.println("============================");




    }
}
