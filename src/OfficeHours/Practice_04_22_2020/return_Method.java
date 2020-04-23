package OfficeHours.Practice_04_22_2020;

public class return_Method {

    public static void main(String[] args) {

        int total = sum(2,4);
        System.out.println(total);
        sum1(5,6);

        String str = "Cybertek";
        String reverse =reversal(str);
        System.out.println(reverse);
    }

    public static void sum1 (int a, int b){
        System.out.println(a+b);
    }

    public static int sum (int a, int b){
        return a+b;
    }

    public static String reversal(String str){
        String result ="";
        for (int i =str.length()-1; i>=0; i--){
            result += "" + str.charAt(i);
        }
        return result;
    }

}
