package JavaClasses.day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); // used for rounding the decimals

        double a = 30/21f;
        System.out.println(a);

        System.out.println(df.format(a));


    }
}
