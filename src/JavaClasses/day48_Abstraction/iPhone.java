package JavaClasses.day48_Abstraction;

public class iPhone extends Phone{

    static {
        brand = "iPhone";
    }


    public iPhone (String model, double price,String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }


    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+phoneNumber);
    }


    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling " +phoneNumber);
    }

    public void texting (long phoneNumber){
        System.out.println("iPhone is texting with "+phoneNumber);
    }



}
