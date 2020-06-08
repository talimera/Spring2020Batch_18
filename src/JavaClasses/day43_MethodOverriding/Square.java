package JavaClasses.day43_MethodOverriding;


public class Square extends Shape{

    public double side;

    public Square(double side){
    this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the square: "+ side*side);
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of the Square: "+ 4*side);
    }


}
