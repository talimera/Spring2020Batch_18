package JavaClasses.day08_IfStatements;
/*
            declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are equal ==> none of them are equal
 */


public class equalNumbers {

    public static void main(String[] args) {


        double n1 = 11;
        double n2 = 19;
        double n3 = 1;

        boolean n1n2 = n1 == n2 && n1 != n3 ;
        boolean n2n3 = n2 == n3 && n1 != n3;
        boolean n1n3 = n1 == n3 && n2 != n1;
        boolean nall = (n1 == n2) && (n3==n2) ;
        boolean nequal = (n1 != n2) && (n3!=n2) && (n1 != n3);

        if(n1n2){
            System.out.println(n1+ " and "+ n2 + " are equal");
        }
        if(n2n3)
        {
            System.out.println(n2+ " and "+ n3 +" are equal");
        }
        if(n1n3){
            System.out.println(n1+ " and "+ n3 +" are equal");
        }
        if(nall){
            System.out.println("All of them are equal");
        }
        if(nequal){
            System.out.println("None of them are equal");
        }



    }


}
