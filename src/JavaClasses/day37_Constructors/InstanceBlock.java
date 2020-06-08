package JavaClasses.day37_Constructors;

import java.time.chrono.IsoChronology;

public class InstanceBlock {

    static{
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {

        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();

        


    }

}
