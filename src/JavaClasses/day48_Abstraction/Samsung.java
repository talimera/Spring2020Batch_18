package JavaClasses.day48_Abstraction;

public class Samsung extends Phone {

    public Samsung(String model,double price,String size){
        brand = "Samsung";
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void calling(long phoneNumber) {

    }

    @Override
    public void texting(long phoneNumber) {

    }



}
