package JavaClasses.day46_final_abstract;

public class Test {

    public void method1(){ // if you use final keyword , we wont be able to override in subclass
        System.out.println("a");
    }


    public class final_methods2 extends Test {

        public void method1(){ // cant overrride with protected modifier
            System.out.println("b");
        }

    }
}
