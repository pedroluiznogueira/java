package lambdas.doublecolonoperator.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoubleColonMethodReference {

    /*
     * it is used to refeer to an already implemented method
     * with the same arguments without having to provide the
     * same implementation again
     *
     * the refered method must be static
     *
     * if the method is not static we must pass the instance
     * of that class that we want to pass before the :: operator
     *
    */

    public static void referedMethod() {
        System.out.println("hey from lambda");
    }

    public static void referedMethodWithParameter(Object parameter) {
        System.out.println(parameter);
    }

    public void referedMethodNonStatic() {
        System.out.println("I am not static, so it is needed to pass the instance");
    }
}

interface FunctionalInterface {
    public abstract void functionalMethod();
}

class ClassThatRefers {

    public static void main(String[] args) {

        // double colon with no parameters passed
        FunctionalInterface functionalInterfaceImpl = DoubleColonMethodReference:: referedMethod;
        functionalInterfaceImpl.functionalMethod();

        // double colon with parameters passed
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) numbers.add(i);
        numbers.forEach(DoubleColonMethodReference::referedMethodWithParameter);

        // double colon for non static methods
        DoubleColonMethodReference instanceOfReferedClass = new DoubleColonMethodReference();
        FunctionalInterface functionalInterfaceImplTwo = instanceOfReferedClass :: referedMethodNonStatic;
        functionalInterfaceImplTwo.functionalMethod();

        // using pre defined functional interface IConsumer
        Consumer<Integer> consumer = DoubleColonMethodReference:: referedMethodWithParameter;
        numbers.forEach(consumer);
    }
}
