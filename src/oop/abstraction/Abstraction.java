package oop.abstraction;

// can't be instanciated
public abstract class Abstraction {
    public static String attributeOne = "attribute one";

    // methods in abstract classes are considered in a static context, so they need to be static
    public static void alertSomething() {
        System.out.println("some alert");
    }

    // body implemented on the subclass
    public abstract void printSomething();

}

class Subclass extends Abstraction {

    public Subclass() {
    }

    // implementing the abstract method
    @Override
    public void printSomething() {
        System.out.println("something");
    }
}

class Main {

    public static void main(String[] args) {
        // accessing static variable in an abstract class
        System.out.println(Abstraction.attributeOne);

        // accessing static methods in an abstract class
        Abstraction.alertSomething();

        // accessing inherited abstract method from an abstract class
        Subclass subclass = new Subclass();
        subclass.printSomething();
    }
}
