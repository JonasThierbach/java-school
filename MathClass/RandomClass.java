package MathClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random NewRandom = new Random();

        int random = NewRandom.nextInt(0, 6);
        boolean randombool = NewRandom.nextBoolean();

        System.out.println("Your random Number: " + (random + 1) + " " + randombool);
    }
}
