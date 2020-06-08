package JavaClasses.day38_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Tomatoes",1.25,5);
        Item item2 = new Item("Banana",0.6,4);
        Item item3 = new Item("milk",5.5,2);
        Item item4 = new Item("Bread",3.99,2);
        Item item5 = new Item("Blueberries",2.99,5);


        System.out.println(item1.calcCost());

        System.out.println(item1);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost = 0;

        for (Item eachItem : shoppingList){
            totalCost += eachItem.calcCost();
        }

        System.out.println(totalCost);

        for (int i =0; i<shoppingList.size();i++){
            totalCost += shoppingList.get(i).calcCost();
        }

        System.out.println(totalCost);

    }

}
