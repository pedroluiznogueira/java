package lambdas.isupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ISupplier implements Supplier {

    /*
     * it is a pre defined interfaces
     * using it we write less code
     * there's no need for creating
     * the functional interface manually
     *
     * remember that to be a funcional interface
     * the interface must have a single abstract method
     *
     * it's abstract method get() returns anything
     * Supplier<R>
     * R - return type of the abstract method
     *
    */
    public static void main(String[] args) {
        Supplier<List<Integer>> supplier = () -> {
            List<Integer> numbersInDatabase = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) numbersInDatabase.add(i);
            return numbersInDatabase;
        };
        List<Integer> fetchedNumbers = supplier.get();
        fetchedNumbers.forEach((number) -> System.out.println(number));
    }

    @Override
    public Object get() {
        return null;
    }
}
