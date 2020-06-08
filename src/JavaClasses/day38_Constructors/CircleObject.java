package JavaClasses.day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your radius");
        double r = scan.nextDouble();

        //double r = 5.5;

        Circle circle1 = new Circle(r);

        System.out.println(df.format(circle1.area()));


    }
}
