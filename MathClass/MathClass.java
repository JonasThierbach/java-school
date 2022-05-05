package MathClass;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double z = Math.max(x, y);

        // z = Math.sqrt(x);

        System.out.println(z);

        Scanner UserInput = new Scanner(System.in);

        System.out.println("Enter x Site:");
        x = UserInput.nextDouble();
        System.out.println("Enter y Site:");
        y = UserInput.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println(z);

        UserInput.close();
    }
}
