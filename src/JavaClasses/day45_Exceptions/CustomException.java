package JavaClasses.day45_Exceptions;

class BreakTimeException extends RuntimeException{  // custom unchecked exception

    public BreakTimeException(){
        super("Its break time, we should take break");
    }

    public BreakTimeException(String str){

    }



}



public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;

        if (breakTime){
            throw new BreakTimeException("lets have a break please");
        }else{
            System.out.println("Continue the class");
        }
    }

}
