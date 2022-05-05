package Variables;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Camaro","Corvette","Tesla"};
        cars[0] = "Mustang";

        System.out.println(cars[0]);

        String[] pizzas = new String[3];
        pizzas[0] = "Salami";
        pizzas[1] = "Margarita";
        pizzas[2] = "Fish";

        System.out.println(java.util.Arrays.toString(pizzas));
    }
}
