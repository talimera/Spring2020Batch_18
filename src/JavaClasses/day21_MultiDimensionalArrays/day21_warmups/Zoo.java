package JavaClasses.day21_MultiDimensionalArrays.day21_warmups;

import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger","Lion","Monkey","Tortoise"};
        String [] birds = {"Parrot","Falcon","Cacaw"};

        String [][] zoo = {wildAnimals,birds};
                    //         0         1

        System.out.println(Arrays.toString(zoo[1]));

        String kfc = zoo[1][2];
        System.out.println(kfc);

        for (String eachbird:zoo[1]){
            if (eachbird.equalsIgnoreCase("cacaw")){
                continue;
            }
            System.out.println(eachbird);
        }



    }
}
