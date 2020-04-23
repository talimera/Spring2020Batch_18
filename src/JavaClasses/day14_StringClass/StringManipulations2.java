package JavaClasses.day14_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = " ";
        String str1 = str.trim();
        boolean a= str1.isEmpty();
        System.out.println(a);

        String z1 = "tiger";
        String z2 = new String("tiger");
        String z3 = "tiger";



        System.out.println(z1==z2); // different objects from different memory locations , false
        System.out.println(z2==z3); // different objects from different memory locations , false
        System.out.println(z1==z3); // true, same object

        // equals() \\

        System.out.println(z1.equals(z2)); //true  Compare to == it is correct because visible texts are matching !! But still cares for case sensitivity
        System.out.println(z2.equals(z3)); //true  Compare to == it is correct because visible texts are matching !! But still cares for case sensitivity
        System.out.println(z1.equals(z3)); //true  Compare to == it is correct because visible texts are matching !! But still cares for case sensitivity

    }
}
