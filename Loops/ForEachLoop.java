package Loops;


import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        //Loop through elements of Arrays

        String[] animals = {"cat", "dog", "rat"};
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Porsche");
        cars.add("Ferrari");
        cars.add("BMW");

        // "for :" -> "for in"
        for (String i : animals) {
            System.out.println(i);
        }

        for (String j : cars) {
            System.out.println(j);

        }
    }
}
