package Learning;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Whats ur Name?");
        String Name = UserInput.nextLine();
        System.out.println("How old are you?");
        int Age = UserInput.nextInt();
        UserInput.nextLine(); //clear Console to prevent \n in next Scanner
        System.out.println("Whats ur favorite Pizza?");
        String Pizza = UserInput.nextLine();

        System.out.println("Hello, " + Name + " you are " + Age + " Years old and you like " + Pizza);
    }
}
