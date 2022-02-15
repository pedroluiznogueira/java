package lambdas.invoking.beforelambdas;

public class BeforeLambdas {

    public static void main(String[] args) {

        // instaciating a implementation class of a functional interface
        FunctionalInteface functionalIntefaceImpl = new FunctionalInterfaceImpl();

        // invoking the method
        functionalIntefaceImpl.firstMethod();

    }
}

@FunctionalInterface
interface FunctionalInteface {

    // must have a single abstract method
    public abstract void firstMethod();

    // can or not have a default method
    public default void secondMethod() {

    }

    // can or not have a static method
    public static void thirdMethod() {

    }
}

class FunctionalInterfaceImpl implements FunctionalInteface {

    @Override
    public void firstMethod() {
        System.out.println("functional method");
    }
}
