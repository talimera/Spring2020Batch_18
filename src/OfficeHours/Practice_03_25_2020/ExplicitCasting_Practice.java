package OfficeHours.Practice_03_25_2020;

public class ExplicitCasting_Practice {

    public static void main(String[] args) {

        byte bnum = 100;

        short snum = bnum;  // implicit casting


        int Inum = 200;

        short Snum = (short) Inum;  // explicit casting

        float fNum = (float)0.5;

        System.out.println(fNum); //0.5

        float fNum2 = (long)0.5;

        System.out.println(fNum2); // 0.0
    // long , int, short, byte ==> only accepts whole numbers
        long lNum1 = (long)4.5;
        System.out.println(lNum1); // 4

        System.out.println(9/2); // 4 because compiler takes it as int number thats why we get 4 instead of 4.5
        System.out.println(9/(float)2); //4.5
        System.out.println(10.0/3); // as long as you have one decimal number compiler will return you a decimal number results





    }
}
