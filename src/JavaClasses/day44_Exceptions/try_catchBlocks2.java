package JavaClasses.day44_Exceptions;

public class try_catchBlocks2 {


    public static void main(String[] args) throws Exception {

        System.out.println("Hello");

        try {

            Thread.sleep(3000); // three seconds

        }catch (Exception e){

          //  printStacktrace();
          //  getMessage();

        }


        System.out.println("World");

    }
}
