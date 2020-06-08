package JavaClasses.day42_Inheritance.Task02;

public class Phone extends Device{


    public Phone(String brand,String model,double price,String size,String country){
        setDevice(brand,model,price,"Phone",size,country);
    }


    public void call (long number){
        System.out.println("Calling "+ number);
    }

}
