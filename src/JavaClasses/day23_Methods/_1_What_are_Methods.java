package JavaClasses.day23_Methods;

public class _1_What_are_Methods {

    // declaration of methods ;
    // Access Modifier , specifier , return type , methodName(){ statements;}

    // Access Modifiers : public , protected , default , private
    // Specifier : static, final, abstract , synchronized
    // Return Type : void, any data type (int,short,byte,String,etc.)(all primitives&Objects)

    // Methods cannot be declared in another Method !!!

    public static void main(String[] args) {
        printKamilBaha5Time();

    }

    public static void printKamilBaha5Time (){

        for (int i =0; i<5; i++){
            System.out.println("Kamil Baha");
        }
    }


}
