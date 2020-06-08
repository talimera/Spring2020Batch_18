package JavaClasses.day46_final_abstract;

import JavaClasses.day42_Inheritance.Task02.Phone;

import java.text.DecimalFormat;

public  final class Circle  extends Shape{


    public double radius;
    public final static double PI = 3.14;

    public Circle (double radius){
        this.radius = radius;
    }


    @Override
    public void Area(){
        DecimalFormat dtf = new DecimalFormat("0.00");
        double area = radius*radius* PI;
        System.out.println("Area is: "+dtf.format(area));
    }






}
