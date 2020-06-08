package JavaClasses.day38_Constructors;

public class ConstructorPractice {

        public ConstructorPractice(){
            this(1.0);
            System.out.println("A");
        }



        public ConstructorPractice(int a){
            this();
            // this(12.2); cant call second constructor
            System.out.println("B");
        }


        public ConstructorPractice(double x){
            // this(); cant call because default constructor already has this constructor itself
            System.out.println("C");
        }

    public static void main(String[] args) {
            new ConstructorPractice(10);

    }
}
