package JavaClasses.day22_Arrays_Loops_Practice;

public class Nested_ForEach_EvenOdd {

    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
        int oddct =0;
        for (int[] eachArray: numbers){
            for (int Element: eachArray){
                if (Element%2 == 0){
                    System.out.print(Element+" ");
                }else{
                    oddct++;
                }
            }
        }
        System.out.println();
        System.out.println(oddct);
    }
}
