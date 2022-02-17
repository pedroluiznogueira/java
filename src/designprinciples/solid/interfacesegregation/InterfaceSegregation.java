package designprinciples.solid.interfacesegregation;

public class InterfaceSegregation {

    /**
     * <p>- interface segregation statews that a client
     * shouldn't be forced to implement an interface that
     * it doesn't use
     * <p>- it is kind of like the SRP but at an interface
     * level
     *
     * <p> business rule
     * <p>- we have an interface Worker with two methods, work()
     * and sleep()
     * <p>- Human and Robot implements Worker but Robot doesn't sleep
     * <p>- the idea for solving it is to break up the interface into
     * smaller interface(s)
     * <p>- so we will create a Sleeping interface
     * <p>- so now only the human will implement the Sleeping interface
     */
    public static void main(String[] args) {

    }
}

interface Worker {
    void work();
}

interface Sleeping {
    void sleep();
}

class Human implements Worker, Sleeping {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}

class Robot implements Worker {

    @Override
    public void work() {}
}
