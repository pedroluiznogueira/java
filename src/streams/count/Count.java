package streams.count;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count {

    /*
     * used to count the number of elements
     * inside a stream
     *
    */
    public static void main(String[] args) {

        // arrange
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        // calculating the stream size
        Long streamSize = numbers.stream().filter(number -> number >= 5).count();

    }
}
