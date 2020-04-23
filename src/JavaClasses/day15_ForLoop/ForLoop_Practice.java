package JavaClasses.day15_ForLoop;

public class ForLoop_Practice {

    public static void main(String[] args) {

        /*
        odd numbers between 1-100 in a single line seperated by a space
         */
        String result ="";
        for (int odd =1; odd<100; odd +=2){
            //System.out.print(odd+" "); can do this way too.
            result += odd+" ";
        }
        System.out.println(result);

        for (int even=2; (even>=2 && even <=100) ;even+=2 ){
            System.out.print(even+" ");
        }
    }

}
