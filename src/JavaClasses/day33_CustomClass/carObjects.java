package JavaClasses.day33_CustomClass;

public class carObjects {

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.Brand = "BMW";
        car1.Model = "X5";
        car1.year = 2020;
        car1.color = "White";

        System.out.println(car1.Brand);
        System.out.println(car1.Model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();

        Car car2 = new Car();
         car2.Brand = "Toyota";
         car2.Model = "Corolla";
         car2.year = 2020;
         car2.color = "Gray";

        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.getCarInfo();



    }

}
