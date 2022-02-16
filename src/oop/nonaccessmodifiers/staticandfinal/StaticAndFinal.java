package oop.nonaccessmodifiers.staticandfinal;

public class StaticAndFinal {

    /*
     * static and final
     *
     * final
     * - classes, variables and methods
     * - finalising the implementation of them
     *
     * classes
     * - avoid beign inherited
     *
     * variables
     * - constants
     *
     * methods
     * - avoid beign overrided by the subclasses
     *
     * static
     * - vatiables and methods
     * - define the member as independent from
     * a class instance
     *
     * variables
     * - can't be used from instances
     * - has only one value shared between all
     * instances of the class
     *
     * methods
     * - can't be used from instances
     * - can't access/use non static attributes
     * from the class
     *
    */
    public static void main(String[] args) {

        // static method
        FirstClass.methodThree();

        // static variable
        String staticVariable = FirstClass.attributeTwo;

        // final variable
        FirstClass firstClass = new FirstClass();
        String constantVaribale = firstClass.attributeOne;

    }
}

class FirstClass {

    // can't be changed
    public final String attributeOne = "CONSTANT";

    // can't be accessed from instances
    public static String attributeTwo = "attribute two";

    // can't be overrided
    public final void methodOne() {
        System.out.println("method one");
    }

    public static void methodThree() {
        System.out.println(attributeTwo);
    }
}

class SecondClass extends FirstClass {

}

// can't be inherited
final class ThirdClass {

}