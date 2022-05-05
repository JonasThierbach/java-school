package Variables;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //ArrayList = a resizable array (store reference data types)

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");

        food.set(0, "Sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
