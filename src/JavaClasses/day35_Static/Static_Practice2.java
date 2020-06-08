package JavaClasses.day35_Static;

public class Static_Practice2 {


    String brand;
    String Model;
    static boolean hasWheels = true;


    public static void main(String[] args) {

        System.out.println(hasWheels);

    }


    public void PrintBrand(){
        System.out.println(brand);

    }

    public void printModel(){
        System.out.println(Model);
    }
}
