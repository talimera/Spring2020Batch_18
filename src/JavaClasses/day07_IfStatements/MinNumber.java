package JavaClasses.day07_IfStatements;
/*write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
				 */

public class MinNumber {

    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMin = a<b && a<c;
        boolean bMin = b<a && b<c;
        boolean cMin = c<b && c<a;

        if(aMin){
            System.out.println("A is minumum number");
        }

        if(bMin){
            System.out.println("B is minumum number");
        }

        if(cMin){
            System.out.println("C is minumum number");
        }





    }



}
