package JavaClasses.day17_WhileLoops.day17_warmups;

public class EvenSum {

    public static void main(String[] args) {

        int i=0;
        int sum =0;

        while ( i<=10 ){
            if (i%2==0){
                sum +=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
