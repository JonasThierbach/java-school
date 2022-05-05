package Variables;

public class Variables {
    public static void main(String[] args) {
        int x; //declaration
        x = 123; //assignment

        int y = 321; //initialisation

        long z = 32423423784723864L;
        float d = 3.14f;

        System.out.println(x + y + z + d);
        System.out.println("My Number is: " + x);

        String temp;
        temp = String.valueOf(x);
        x = y;
        y = Integer.parseInt(temp);

        System.out.println(x);
        System.out.println(y);

        /*
        boolean   / 1bit = true or false
        byte      / 1byte = -128 to 127
        short     / 2bytes = -32.768 to 32.767
        int       / 4bytes = -2.000.000.000 to 2.000.000.000
        long      / 8bytes = -9 quintillion to 9 quintillion (+ L)

        float     / 4bytes = fractional Number up to 6-7 digits: ex. 3.123424f
        double    / 8bytes = fractional Number up to 15 digits: ex. 3.382739283920398

        char      / 2bytes = single letter: ex. "f"
        string    / varies = ex. "Hello World"

         */

    }
}
