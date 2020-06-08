package JavaClasses.day43_MethodOverriding;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle (double length,double width){
        this.length = length;
        this.width = width;

    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the Rectangle: "+ length * width);
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of the Rectangle: " + (length+width)*2);
    }




}
