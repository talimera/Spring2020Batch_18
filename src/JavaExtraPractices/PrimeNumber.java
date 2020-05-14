package JavaExtraPractices;

public class PrimeNumber {


    public static void main(String[] args) {

           /* int num =14;
            int count = 0 ;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }

            }
            if(count == 2){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num+ " is not a prime member");
            }

            */

        boolean prime = isPrime(29);
        System.out.println(prime);

    }


    public static boolean isPrime (int num){

        int count = 0 ;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }



}
