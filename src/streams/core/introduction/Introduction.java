package streams.core.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Introduction {

    /*
     * it is used for proccessing data
     * it's advantage is that uses multicore
     * processor features, so it leads to
     * best perfomance
     *
     * helps to write less code
     *
     * used to procces the collections objects
     * whenever you need to procces data from
     * an existing collection and based on some
     * condition, retrieve another collection
     * from the existing one
     *
    */
    public static void main(String[] args) {

        // arrange
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        /*
         * business rule -> want only values >= 5
         *
         * we need a new list from the existing one
         * but we only need the values that match
         * the business rule
         *
        */

        // without streams
        List<Integer> newNumbers = new ArrayList<Integer>();
        for (Integer number: numbers) {
            if (number >= 30) newNumbers.add(number);
        }

        // with streams

        // filter
        List<Integer> filteredList = numbers.stream().filter(number -> number >= 5).collect(Collectors.toList());
        System.out.println(filteredList);

        // map
        List<Integer> mappedList = numbers.stream().map(number -> number * 2).collect(Collectors.toList());
        System.out.println(mappedList);

    }
}
