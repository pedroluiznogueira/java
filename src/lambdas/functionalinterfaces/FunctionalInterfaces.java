package lambdas.functionalinterfaces;

public class FunctionalInterfaces {

    /*
     * if an interface contains only single abstract methods
     * than it's called a functional interface
     *
     * doesn't matter how many default or static void it has
     * it must have only single abstract methods
     *
     * examples
     *
     * IRunnable - run()
     * ICallable - call()
     * IComparable - compareTo()
     *
     * functional interfaces are used to invoke lambda expressions
     *
    */
    public static void main(String[] args) {


    }
}

interface FirstFunctionalInterface {

    // by default it is a abstract method
    public abstract void firstMethod();
}

interface SecondFunctionalInterface {

    // by default it is a abstract method
    public abstract void firstMethod();

    // default method
    default void secondMethod() {

    }

    // static method
    static void thirdMethod() {

    }
}

interface FirstNotFunctionalInterface {

    // not single abstract method
    public abstract void firstMethod();

    // not single abstract method
    public abstract void secondMethod();
}