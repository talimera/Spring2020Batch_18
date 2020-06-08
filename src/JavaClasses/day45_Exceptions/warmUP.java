package JavaClasses.day45_Exceptions;

public class warmUP {

    public static void main(String[] args) throws InterruptedException {
        int pushups = 0;
        while ( pushups <10){
            System.out.println("Pushup " + (pushups+1));
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }

            pushups++;

        }
    }


}
