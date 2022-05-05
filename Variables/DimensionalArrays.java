package Variables;

public class DimensionalArrays {
    public static void main(String[] args) {
        //2D array = array ouf of arrays

        /*
        String[][] cars = new String[3][3];
        cars[0][0] = "Porsche";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Camaro";
        cars[2][1] = "BMW";
        cars[2][2] = "Mercedes";
        */

        String[][] cars = {
                {"Porsche","Corvette","Silverado"},
                {"Mustang","Ranger","Ferrari"},
                {"Camaro","BMW","Mercedes"}};

        System.out.println(cars[2][1]);

        for (int i = 0; i <  cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
    }
}
