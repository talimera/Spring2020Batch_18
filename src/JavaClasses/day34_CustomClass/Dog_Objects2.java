package JavaClasses.day34_CustomClass;

public class Dog_Objects2 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky","Large",4,"Black and White","The Dawg");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Japanese Mastiff","Large",6,"Brown","BigBac");

        dog2.eating("Cane");

        dog1.drinking("water");

        dog1.playing("The Cane");

        Dog [] dogpark ={dog1,dog2};

        System.out.println("========================================");

        for (Dog eachDog :dogpark){
            eachDog.eating("chicken");
        }

        System.out.println("========================================");

        for (Dog eachDog: dogpark){
            eachDog.playing("ball");
        }

    }
}
