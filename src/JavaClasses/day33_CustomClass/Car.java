package JavaClasses.day33_CustomClass;

public class Car {

    String Brand; // instance variables
    String Model; // instance variables
    int year; // instance variables
    String color; // instance variables


    // instanced method - Object method
    public void start(){
        System.out.println(Brand+" is started");
    }

    public void drive(){
        System.out.println("Driving "+Brand+" "+Model);
    }

    public void getCarInfo(){
        System.out.println("Year of the car is "+year);
        System.out.println("Brand of the car is "+Brand);
        System.out.println("Model of the car is "+Model);
        System.out.println("Color of the car is "+ color);
    }

    public void setCarInfo(String carBrand,String carModel, int carYear, String carColor){
        Brand = carBrand;
        Model = carModel;
        year = carYear;
        color = carColor;

    }

    public String toString(){
        String result = year+" "+Brand+" "+Model+" "+color;
        return result;
    }

    public static void main(String[] args) {

        int a = 100; // local variable
    }

}
