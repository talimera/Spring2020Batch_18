package JavaClasses.day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog_Objects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        /*
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;
         */

        dog1.setDogInfo("Husky","Large",4,"Black and White","The Dawg");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Japanese Mastiff","Large",6,"Brown","BigBac");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Chiuhauha","Miniature",2,"Dark Brown","Minnie");

        System.out.println(dog1);

        System.out.println("=======================================================================");

        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.addAll(Arrays.asList(dog1,dog2,dog3));

        for (Dog eachdog : dogList){
            System.out.println(eachdog);
        }

        System.out.println("========================================================================");

        dogList.removeIf( p ->p.age>2);

        System.out.println(dogList);


    }
}
