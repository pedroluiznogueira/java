package lambdas.iconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IConsumer implements Consumer {

    /*
     * it is a pre defined interfaces
     * using it we write less code
     * there's no need for creating
     * the functional interface manually
     *
     * remember that to be a funcional interface
     * the interface must have a single abstract method
     *
     * it's abstract method accept() returns void
     * Consume<T>
     * T - type of the parameter for the abstract method
     *
    */
    public static void main(String[] args) {

        Integer numberToDuplicate = 100;
        Consumer<Integer> consumer = (number) -> System.out.println(number);
        consumer.accept(numberToDuplicate);

        // applying consumer in collections
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) numbers.add(i);
        Consumer<Integer> anotherConsumer = (number) -> System.out.println(number + 1);
        numbers.forEach(anotherConsumer);

        // directly with lambdas in collections
        numbers.forEach((number) -> System.out.println(number * 2));

    }

    // the abstract method
    @Override
    public void accept(Object o) {

    }
}
