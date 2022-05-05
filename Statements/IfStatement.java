package Statements;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Input.nextInt();

        if(age > 50) {
            System.out.println("You're a boomer!");
        } else if (age > 18) {
            System.out.println("You're 18 years old!");
        } else {
            System.out.println("You're 18 years old!");
        }
    }
}
