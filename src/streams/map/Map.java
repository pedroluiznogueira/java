package streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {

    /*
     * filter is a method in the Strem interface
     * public Stream map(Function<T, R> mapper)
     * where this Function is function expression
     * for each element in the collection
     *
     * more formally we are using the single abstract method
     * for the functional interface Function<T, R>
     * where T is the object to be passed to the abstract method
     * and R is the return type to be returned from the abstract method
     * public Object apply(Object o);
     *
    */
    public static void main(String[] args) {

        // arrange
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        // map passing a function expression
        List<Integer> mappedListOne = numbers.stream().map(number -> number * 2).collect(Collectors.toList());

        // map passing a Function<T, R>
        Function<Integer, Integer> function = (number) -> number * 2;
        List<Integer> mappedListTwo = numbers.stream().map(function).collect(Collectors.toList());

    }
}
