package JavaClasses.day41_Inheritance;

public class Fish extends Animal {


    public static void main(String[] args) {

        Fish fish1 = new Fish();
        fish1.Name = "Nemo";

    }

    public  void swim(){
        System.out.println(Name+" is swimming");

    }




}
