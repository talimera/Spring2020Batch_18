package JavaClasses.day38_Constructors;

import JavaClasses.day35_Static.The_Dawg;

public class TheDawg {

    String name;
    String breed;
    int age;


    public TheDawg (){

        name = "unknown";
        breed = "unknown";
        age = 0;

    }

    public TheDawg(String breed){
        this.breed = breed;
        name ="unknown";
        age = 0;

    }

    public TheDawg(String breed , int age){
        this.breed = breed;
        this.age = age;
        name = "unknown";

    }

    public String toString() {
        return "Dog{" +
                "name= " + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }




}
