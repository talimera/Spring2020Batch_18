package JavaClasses.day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {

    public static void main(String[] args) {

        // throw(keyword) manually throws an unchecked exception while throws get rid of the exception rather than creating it
        // we basically create an exception that means basically creating a intentionally breaking it

        NoSuchElementException obj = new NoSuchElementException();

        //throw new NoSuchElementException();

        //System.out.println();

        boolean breakTime = true;

        if (breakTime){
            //throw new IOException(); cant throw a checked exception with throw without after handling it
            throw new RuntimeException();
        }




    }

    public static void method1() throws Exception,IOException {
                                      // Child to parent
        Thread.sleep(3000);

        // throw keyword can throw one exception at a time
        // throw new Exception(),IOException();


    }

    public static void method2(){

        throw new RuntimeException();
        //unreachable statement due exception so it will give compile error
        //System.out.println("Asdfadf");
    }

}
