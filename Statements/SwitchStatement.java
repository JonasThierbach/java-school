package Statements;

public class SwitchStatement {
    public static void main(String[] args) {

        String day = "friday";

        //default switch
        switch(day) {
            case "sunday": System.out.println("It's Sunday");
            break;
            case "friday": System.out.println("It's Friday");
            break;
            case "monday": System.out.println("It's Monday");
            break;
            case "tuesday": System.out.println("It's Tuesday");
            break;
            default: System.out.println("It's nothing");
        }

        //enhanced switch
        switch (day) {
            case "sunday" -> System.out.println("It's Sunday");
            case "friday" -> System.out.println("It's Friday");
            case "monday" -> System.out.println("It's Monday");
            case "tuesday" -> System.out.println("It's Tuesday");
        }
    }
}
