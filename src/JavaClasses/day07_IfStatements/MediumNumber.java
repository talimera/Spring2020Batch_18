package JavaClasses.day07_IfStatements;
/*
write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */

public class MediumNumber {

    public static void main(String[] args) {


        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMedium = (c>a && a>b) || (a>c && b>a);
        boolean bMedium = (a>b && b>c) || (b>a && c>b);
        boolean cMedium = (c>b && c<a) || (b>a && a>c);

        if(aMedium){
            System.out.println("A is medium number");
        }

        if(bMedium){
            System.out.println("B is medium number");
        }

        if(cMedium){
            System.out.println("C is medium number");
        }





    }
}
