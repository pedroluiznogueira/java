package oop.polymorphism;

public class Polymorphism {
    protected String attributeOne;

    public Polymorphism() {
        this.attributeOne = "attribute one";
    }

    public Polymorphism(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public void printSomething() {
        System.out.println("something");
    }
}

class Subclass extends Polymorphism {
    private String attributeTwo;

    public Subclass() {
        this.attributeTwo = "attribute two";
    }

    public Subclass(String attributeOne) {
        super(attributeOne);
    }

    @Override
    public void printSomething() {
        System.out.println("changing the implementation of the superclass method");
        System.out.println(attributeTwo);
    }
}

class Main {

    public static void main(String[] args) {
        Polymorphism superclass = new Polymorphism();
        superclass.printSomething();

        Subclass subclass = new Subclass();
        subclass.printSomething();
    }
}
