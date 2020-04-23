package JavaClasses.day24_Methods;

import Resources.Library;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "Cybertek";
        String reverse = Library.Reverse2(str);

        System.out.println(reverse);


        int arr [] ={100,200,32131,14124,1221,123141};

        arr = Library.sortDesending(arr);

        System.out.println(Arrays.toString(arr));
    }
}
