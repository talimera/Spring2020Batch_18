package JavaClasses.day18_NestedLoop.day18_warmups;

public class DivideTwoNumbers {

    /*
    write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

     10/3 ===> 10-3-3-3=1

     */

    public static void main(String[] args) {

        int a= 10;
        int b= 3;

        int count =0;

        if (b == 0){
            System.out.println("B cannot be zero"); // denominator cannot be zero thats why we need to stop entire program
            System.exit(0);
        }

        while(a>=b){
            a -= b;
            count++;
        }

        if (a == 0){
            System.out.println("The result is "+count);
        }else{
            System.out.println("The result is "+count+" with a remainder of "+a);
        }




    }


}
