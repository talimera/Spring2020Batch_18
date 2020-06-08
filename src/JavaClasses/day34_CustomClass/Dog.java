package JavaClasses.day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo (String breed, String size , int age, String color, String name){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;

    }

    public String toString(){
        return "Dog name is: "+name+"\nDog breed is: "+breed+"\nDog size is: "+size+"\nDog age is: "+age+"\nDog color is: "+color;
    }


    public void eating(String food){
        System.out.println(name+" is eating "+ food);
    }

    public void drinking(String drink){
        System.out.println(name+" is drinking "+ drink);
    }

    public void playing(String toy){
        System.out.println(name+" is playing with "+ toy);
    }



}
