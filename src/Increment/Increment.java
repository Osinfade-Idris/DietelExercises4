package Increment;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("c before post increment: %d%n", c);
        System.out.printf("post incrementing: %d%n", c++);
        System.out.printf("c after post incrementing: %d%n", c);

        System.out.println();

        c = 5;
        System.out.printf("c before pre increment: %d%n", c);
        System.out.printf("pre incrementing: %d%n", ++c);
        System.out.printf("c after pre incrementing: %d%n", c);
    }
}
