package JavaClasses.day36_StaticBlock;


import JavaClasses.day34_CustomClass.Tester;

    public  class Static_Block2 {

        static int a;
        static int b;
        int c;
    /*
    if(100 > 200){
        a = 100;
    }else{
        b= 200;
    }
     */

        static Tester tester1 = new Tester();

        public static void main(String[] args) {

        }

        static {
            a = 100;
            b = 200;
            // c = 300; // static only accepts static
            if (100 > 200) {
                a = 100;
            } else {
                b = 200;
            }

            tester1.setTesterInfo("Jean", 123, "SDET", 120000);
        }

    }

