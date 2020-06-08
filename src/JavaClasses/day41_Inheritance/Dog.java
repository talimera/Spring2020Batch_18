package JavaClasses.day41_Inheritance;

public class Dog extends Animal{

/*
 public String Name;
    public String Size;
    public double weight;


    public void eat(){
        System.out.println(Name+" is eating");
    }

    public void move(){
        System.out.println(Name+" is moving");
 */


    // Inherited the Animal class variables and methods

    public static void main(String[] args) {

        Dog dog1 = new Dog();
            dog1.Name = "Lucy";

        System.out.println(dog1.Name);

        dog1.eat();
        dog1.move();
    }


    public void bark(){
        System.out.println(Name+" is barking");
    }


}
