package JavaClasses.day02_Variables;

public class Variables {

    public static void main(String[] args) {
            /*
            declare variables:
                DataType    variableName = Data;
             */
         byte l = 4;
         byte w = 2;
         byte area = 8;
         System.out.println(l);
         System.out.println(w);
         System.out.println(area);

         short num3 = 1000;
        System.out.println(num3);

        int n1=100000;
        System.out.println(n1);

        long n2 = 9999999999l;
        // we need to add l at the end bc compiler by default takes it as int.
        System.out.println(n2);

        double d1= 3.5;
        float  f2= 4.5f;
        System.out.println(f2);
        System.out.println(d1);
    }
}
