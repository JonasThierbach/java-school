package Methodes;

public class OverloadedMethodes {
    public static void main(String[] args) {
        /*
         overloaded Methodes = Methodes that share the same name but different parameters'
         method name + parameters = methode signature
        */

        int a = 21;
        int b = 12;
        int result = add(a,b);
        System.out.println(result);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded Methode #1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded Methode #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded Methode #3");
        return a + b + c + d;
    }
}
