package JavaClasses.day16_ForLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i=1; i<=5; i++){ // i:1,2,3,4,5

            if (i==3){  // it skips 3
                continue;
            }
            System.out.println(i);
        }

        System.out.println("=========================================");


        for (int i=0; i<=20; i++){
            if (i%2!=0){    // skips all the odd number// i%2==0 for even number
                continue;
            }
            System.out.println(i);
        }






    }

}
