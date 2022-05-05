package Loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

        System.out.println("Enter # of Rows:");
        int rows = UserInput.nextInt();
        System.out.println("Enter # of columns:");
        int columns = UserInput.nextInt();
        System.out.println("Enter Symbol:");
        String symbol = UserInput.next();

        for (int i = 0; i <= (rows - 1); i++) {
            System.out.println();
            for (int j = 0; j <= (columns - 1); j++) {
                System.out.print(symbol);
            }
        }
    }
}
