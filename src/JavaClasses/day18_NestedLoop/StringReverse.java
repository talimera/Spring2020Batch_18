package JavaClasses.day18_NestedLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "kamil baha";

        String reversed="";

        int lastIndex = str.length()-1;

        do {
            reversed += str.charAt(lastIndex);

            lastIndex--;

        }while (lastIndex>=0);

        System.out.println(reversed);
    }
}
