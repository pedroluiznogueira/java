package oop.nonaccessmodifiers.abstraction;

public class Abstraction {

    /*
     * abstract, static and final
     *
     * abstract
     * - for classes and methods
     *
     * classes
     * - is a class not fully implemented
     * - can't be instanciated
     * - might contain non
     * final variables
     * - good to declare non-public members
     * - allows static methods aswell
     * - allows you to implement methods aswell
     * not only declare them as the interfaces
     *
     * methods
     * - do not have any implementation
     * - are only declared in abstract classes
     * - only the subclasses of the abstract class
     * provide the implementation of the abstract methods
     *
    */
    public static void main(String[] args) {

        // extended methods
        SecondClass secondClass = new SecondClass();
        secondClass.methodThree();

        // static method from abstract class
        FirstClass.methodFive();
    }
}

abstract class FirstClass {

    public abstract void method();

    protected abstract void methodTwo();

    protected void methodThree() {
        System.out.println("method three called");
        methodTwo();
        methodFour();
    }

    private void methodFour() {
        System.out.println("method four used from other method");
    }

    public static void methodFive() {
        System.out.println("method five called");
    }
}

class SecondClass extends FirstClass {

    @Override
    public void method() {
        System.out.println("method one implemented");
    }

    @Override
    public void methodTwo() {
        System.out.println("method two implemented");
    }

    @Override
    protected void methodThree() {
        super.methodThree();
    }
}
