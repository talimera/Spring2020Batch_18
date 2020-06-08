package JavaClasses.day34_CustomClass;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;


    public double calcCost(){
        double total = (width*length)*unitPrice;
        return (isPersian) ? total+200: total ;
    }

    public void customOrder(double carpetWidth, double carpetLength, double carpetPrice, boolean Persian){
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetPrice;
        isPersian = Persian;
    }

    public String toString(){
        return "width: "+ width+ "\nlength: "+length+ "\nCarpet price: $"+unitPrice+ "\nPersian Carpet: "+ isPersian+
                "\n Total Price is: $"+ calcCost();
    }




}
