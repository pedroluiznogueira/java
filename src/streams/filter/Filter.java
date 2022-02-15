package streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    /*
     * filter is a method in the Strem interface
     * public Stream filter(Predicate<T> t)
     * where this Predicate is a condition to pass
     * for each element in the collection
     *
     * more formally we are using the single abstract method
     * for the functional interface Predicate<T>
     * where T is the object to be passed to the abstract method
     * public Boolean test(Object o);
     *
    */
    public static void main(String[] args) {

        // arrange
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        // filter passing a boolean expression
        List<Integer> filteredListOne = numbers.stream().filter(number -> number >= 5).collect(Collectors.toList());

        // filter passing a Predicate<T>
        Predicate<Integer> predicate = number -> number >= 5;
        List<Integer> filteredListTwo = numbers.stream().filter(predicate).collect(Collectors.toList());

    }
}
