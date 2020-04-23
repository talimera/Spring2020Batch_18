package OfficeHours.Practice_04_22_2020;

public class return_Statement {

    public static void main(String[] args) {
    /*
        if (10>9){
            return; // anything after this line will not execute and method will end
        }
        System.out.println("Hello world");
     */
        method1();
        System.out.println("hello world"); // will be executed even method1 has a return statement.Because return statement only affects the method its stored

    }

    public static void method1(){
        if (10>9){
            return; // it will only exit from method1. When put in main method it wont affect the Main method.Only affects method its stored.
        }
        System.out.println("Hello Cybertek"); // will not be executed because of the return statement.

    }


}
