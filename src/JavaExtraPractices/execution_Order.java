package JavaExtraPractices;

public class execution_Order {

    public static void main(String[] args) {

        // Java execution starts from top to bottom. You can see it from the results.
        byte bNum = 126;
        short bNum2 = 1000;
        bNum2 = bNum;

        System.out.println(bNum2);

        short bNum3 = 987;
        bNum2 = bNum3;

        System.out.println(bNum2);

        System.out.println("3"+'3');
        








    }

}
