package oop.staticmethods;

public class StaticMethods {

    public static void main(String[] args) {
        // accessed without an instance of StaticMethods class
        printSomething();
    }

    public static void printSomething() {
        System.out.println("something");
    }
}
