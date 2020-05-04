package JavaClasses.day33_CustomClass;

import java.util.Arrays;

public class carObject2 {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setCarInfo("BMW","X6",2020,"White");

         car1.getCarInfo();

        System.out.println("=================================");

        Car car2 = new Car();

        car2.setCarInfo("Toyota","Corolla",2020,"Titanium");

        car2.getCarInfo();

        System.out.println("==================================");

        Car car3 =  new Car();
        car3.setCarInfo("Lexus","RX400h",2008,"Black");
        car3.getCarInfo();

        System.out.println("===================================");

        Car [] cars = {car1,car2,car3};

        for (int i = 0 ; i< cars.length; i++){
            cars[i].getCarInfo();
        }



        System.out.println("====================================");

        for (Car each : cars){
            each.getCarInfo();
        }

        System.out.println("=====================================");

        System.out.println(car1);

    }
}
