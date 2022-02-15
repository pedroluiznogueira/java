package lambdas.doublecolonoperator.constructorreference;

public class DoubleColonConstructorReference {

    /*
     * it is used when the abstract method
     * of the functional interface needs to
     * return an object of some class
     *
     * recommended if the abstract method of
     * the functional interface needs to return
     * and object of any class
     *
    */
    public static void main(String[] args) {

        // with double colon
        FunctionalInterface functionalInterface = ClassWichContructorIsRefered :: new;
        ClassWichContructorIsRefered instance = functionalInterface.functionalMethod("string passed", 10);

    }

}

interface FunctionalInterface {
    public abstract ClassWichContructorIsRefered functionalMethod(String someString, Integer someInteger);
}

class ClassWichContructorIsRefered {

    public ClassWichContructorIsRefered(String someString, Integer someInteger) {
        System.out.println(someString);
        System.out.println(someInteger);
    }

}