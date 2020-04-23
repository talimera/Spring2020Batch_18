package JavaClasses.day21_MultiDimensionalArrays.day21_warmups;

import java.text.DecimalFormat;

public class AverageNum {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        int [] arr = {10,20,30,40,50,23,14};

        int length = arr.length;
        int sum = 0;

        for (int i =0; i < length; i++){
            int eachnum = arr[i];
            sum += eachnum;
        }
        System.out.println(sum);

        double average = (double)sum/length;
        System.out.println(df.format(average));

        int [] arr2 ={1,2,2};
        System.out.println(5/(double)3);



    }
}
