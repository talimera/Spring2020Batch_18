package JavaClasses.day32_Predicate;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {

    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x %2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,56,6,78,9));
            list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("============================");

        Predicate<Integer> lessThan5 = Y -> Y < 5 ;
        ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1,2,3,4,5,6,78,234,25,12));
            list2.removeIf(lessThan5);
        System.out.println(list2);

        System.out.println("===============================");

        Predicate<String> startsWithM = s -> !s.startsWith("M");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza","Mohammed","Boris","Sha","Bilal"));
        names.removeIf(startsWithM);
        System.out.println(names);

        System.out.println("================================");

        Predicate<String> MorA = each -> each.startsWith("M") || each.startsWith("A");

        ArrayList<String> namelist = new ArrayList<>();
        namelist.addAll(Arrays.asList("Muhtar","Alex","Asiya","Dilnaz","Radu"));
        namelist.removeIf(MorA);
        System.out.println(namelist);


    }
}
