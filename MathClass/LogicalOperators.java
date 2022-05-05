package MathClass;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

        Scanner UserInput = new Scanner(System.in);

        System.out.println("You are playing a game! Press \"q\" or \"Q\" to quit");
        String response = UserInput.next();

        if(!response.equals("q") && !response.equals("Q") ){
            System.out.println("You're still playing!");
        } else {
            System.out.println("You quit the game!");
        }
    }
}
