package JavaClasses.day43_MethodOverriding;


public class Circle extends Shape{


    public double radius;
    public static double Pi = 3.14;


    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the Circle: "+Pi*radius*radius);
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of the Circle: "+ 2* Pi*radius);
    }
}
