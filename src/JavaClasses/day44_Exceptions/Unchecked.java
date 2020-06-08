package JavaClasses.day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {

        System.out.println("test completed"); // this will be compiled before Arithmetic Expection

        // System.out.println(9/0); // Arithmethic Exception

        // System.out.println("Test completed"); // while exception still continues cannot run the remaining codes


        String str = "Cybertek";

        //System.out.println(str.charAt(-1)); // out of bound exception -- Unchecked exception

        System.out.println("test completed");

        int arr [] = {11,2,3};

        //System.out.println(arr[4]); // Another arrays out of bounds exception (part of index out of bounds exception) -- Unchecked exception







    }

}
