package streams.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    /*
     * sorting can be performed in two ways
     * default natural sorting: sorted()
     * and custom sorting: sorted(Comparator c)
     *
    */
    public static void main(String[] args) {

        // arrange
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(45);
        numbers.add(23);
        numbers.add(98);

        // natural sorting
        List<Integer> filteredListOne = numbers.stream().filter(number -> number >= 20).sorted().collect(Collectors.toList());

        // custom sorting, passing a comparator in the sorted() method
        Comparator<Integer> comparator = (firstObject, secondObject) -> {
            if (firstObject > secondObject) return -1;
            if (firstObject < secondObject) return 1;
            return 0;
        };
        List<Integer> filteredListTwo = numbers.stream().filter(number -> number >= 20).sorted(comparator).collect(Collectors.toList());
        System.out.println(filteredListTwo);
    }
}
