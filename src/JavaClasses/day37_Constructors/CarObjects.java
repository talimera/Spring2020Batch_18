package JavaClasses.day37_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Lexus","Rx400h",2008,10000);
        System.out.println(car1);

        System.out.println(car1.brand);
        System.out.println(car1.model);
    }

}
