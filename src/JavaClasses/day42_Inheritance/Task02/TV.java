package JavaClasses.day42_Inheritance.Task02;

public class TV extends Device{


    public TV(String brand,String model,double price,String size,String country){
        setDevice(brand,model,price,"TV",size,country);

    }


    public void watch(){

        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );

    }


}
