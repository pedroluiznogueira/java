package lambdas.invoking.afterlambdas;

public class AfterLambdas {

    public static void main(String[] args) {

        // storing the lambda implementation of the functional interface method
        AnotherFunctionalInteface functionalInterfaceImpl = () -> System.out.println("functional method with lambda");

        // invoking the method
        functionalInterfaceImpl.firstMethod();
    }
}

@FunctionalInterface
interface AnotherFunctionalInteface {

    // must have a single abstract method
    public abstract void firstMethod();

    // can or not have a default method
    public default void secondMethod() {

    }

    // can or not have a static method
    public static void thirdMethod() {

    }
}

