package oop.interfaces;

public class Interfaces {

    /*
     * a blue print of a class that specifies
     * what a class must have/do
     * only have method declarations
     * all methods are abstract and public by default
     *
     * <modifier> interface <interfaceName> {
     *      public abstract method();
     * }
     *
     * until java 7
     * - only abstract methods
     *
     * after java 8
     * - abstract, default, static methods
     *
     * after java 9
     * - abstract, default, static, private methods
     *
     * attributes are always static final
     * static - can't be accessed from instances
     * final - constant values so won't be modified
     *
     * static and default methods are used if an existing
     * interface that is already beign implemented needs
     * to have some methods added, if they are not static
     * or default, all the implementation classes will
     * have to implement them
     *
    */
    public static void main(String[] args) {

        // interface attribute
        String staticFinalVariable = FirstInterface.attributeOne;

        // interface static method
        FirstInterface.methodTwo();

        // interface default method using interface private method
        FirstClass firstClass = new FirstClass();
        firstClass.methodThree();

    }
}

interface FirstInterface {

    // attribute
    public static final String attributeOne = "CONSTANT";

    // abstract method - no implementation
    public abstract void methodOne();

    // static method - can't be accessed from instances
    public static void methodTwo() {
        System.out.println("static method from interface");
    }

    // default method
    default void methodThree() {
        System.out.println("default method from interface");
        methodFive();
    }

    // private method
    private void methodFive() {
        System.out.println("private method in the interface");
    }

}

class FirstClass implements FirstInterface {

    @Override
    public void methodOne() {
    }

    @Override
    public void methodThree() {
        FirstInterface.super.methodThree();
    }
}
