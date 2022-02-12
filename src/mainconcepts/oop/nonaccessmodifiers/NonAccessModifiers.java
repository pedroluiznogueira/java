package mainconcepts.oop.nonaccessmodifiers;

// the class can't be inherited by other classes
public final class NonAccessModifiers {

    // constant variable
    public final String CONSTANT = "constant value";

    public NonAccessModifiers() {
    }

}

// that class can't be instanciated
abstract class Abstract {
    // this variable is accessed without an instance of this class
    public static String attributeOne = "attribute one";

    // abstract mainconcepts.methods doesn't have a body, because are implemented by the subclass
    abstract void printSomething();
}

class Main {

    public static void main(String[] args) {
        System.out.println(Abstract.attributeOne);

        NonAccessModifiers object = new NonAccessModifiers();
        System.out.println("Can't have assigned or setted values: " + object.CONSTANT);

    }
}
