package JavaClasses.day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("banana");
        shoppingList.add("bread");
        shoppingList.add("milk");

        System.out.println(shoppingList);

        for (String each: shoppingList){
            System.out.println(each);
        }
    }
}
