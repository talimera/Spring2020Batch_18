package JavaClasses.day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(100));
        }catch(Exception e){
            System.out.println( e.getMessage());
            System.out.println(e.getStackTrace());
        }

        System.out.println("completed");
    }
}
