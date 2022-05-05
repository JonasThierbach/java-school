package Variables;

import java.util.ArrayList;

public class DimensionalArrayLists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("Doughnuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Soda");
        drinksList.add("Water");

        shoppingList.add(produceList);
        shoppingList.add(drinksList);
        shoppingList.add(bakeryList);

        System.out.println(bakeryList.get(0));
        System.out.println(shoppingList.get(0).get(0));
        System.out.println(shoppingList);
    }
}
