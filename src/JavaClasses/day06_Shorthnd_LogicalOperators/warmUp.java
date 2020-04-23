package JavaClasses.day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {


        /*warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
                           */


        double numberofGalons= 3;
        double galontoLiters= numberofGalons*3.785;

        String Results = numberofGalons + " gallons equal to: "+ galontoLiters+ " liters";
        System.out.println(Results);


        double numberofLiters = 16;
        double literstoGallons= numberofLiters/3.785;

        String results = numberofLiters + " liters equal to "+ literstoGallons +" gallons";
        System.out.println(results);


        int a = 200;
        int b = -a++ + - --a * a-- %2; // every increment and decrement in here affects the value of the a !!!!!
        /*
        -a++ ---> a becomes 201
        - --a ---> a becomes 200
        a-- ----> a becomes 199
            */


        System.out.println(b); //-200
        System.out.println(a);


        int x= 300;
        int y= 400;

        int z = x + y - x*y +x/y; // 300/400 will be 0 because int doesnt take any decimals.

        System.out.println(z);



    }

}
