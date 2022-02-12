package oop.interfaces;

public class Interfaces implements Interface {

    // implementing the body of the method from the interface
    @Override
    public void printSomething() {
        System.out.println("something");
    }
}

// like abstract classes, interfaces cannot be used to create objects
// interface methods do not have a body - the body is provided by the "implement" class
// on implementation of an interface, you must override all of its methods
// interface methods are by default abstract and public
// interface attributes are by default public, static and final
// an interface cannot contain a constructor (as it cannot be used to create objects)
abstract interface Interface {

    // don't use it, instead implement an abstract class
    public static final String attributeOne = "attribute one";

    public abstract void printSomething();
}

class Main {

    public static void main(String[] args) {
        Interfaces object = new Interfaces();
        object.printSomething();
    }
}
