package JavaClasses.day07_IfStatements;

/*write a java program that accepts three numbers and return the maximum number
        (assume that none of them are equal)
 */
public class MaxNumber {

    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aGreater = a>b && a>c;
        boolean bGreater = b>a && b>c;
        boolean cGreater = c>b && c>a;

        if(aGreater){
            System.out.println("A is greater number");
        }

        if(bGreater){
            System.out.println("B is greater number");
        }

        if(cGreater){
            System.out.println("C is greater number");
        }





    }
}
