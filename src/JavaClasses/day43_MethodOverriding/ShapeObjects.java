package JavaClasses.day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        //System.out.println(circle1.radius);

        circle1.calculateArea(); // bug  suppose to be: Pi*r*r // fixed by overriding
        circle1.calculatePerimeter(); // bug


        System.out.println("========================");


        Rectangle rec1 = new Rectangle(3,4);

        rec1.calculateArea(); // bug suppose to be: w*l // fixed by overriding
        rec1.calculatePerimeter(); //bug

        System.out.println("===============================");

        Square sq1 = new Square(4);

        //System.out.println(sq1.side);
        sq1.calculateArea(); // bug suppose to be : side*side // fixed by overriding
        sq1.calculatePerimeter();



    }
}
