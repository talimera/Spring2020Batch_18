package JavaClasses.day16_ForLoop.day16_Warmups;

public class CalculateSum_100 {

    public static void main(String[] args) {
        int sum = 0;
        int sum1 =0;

        for (int i=0; i<=100; i++){
            if (i%2==0){ // sum of the even number
            sum += i;
            }else{ // sum of the odd number
            sum1 += i;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
