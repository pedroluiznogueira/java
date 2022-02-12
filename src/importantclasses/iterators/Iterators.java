package importantclasses.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {

        // instanciating a collection to be iterated
        // useful for design purposes
        // iterator methods are fail-fast
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");

        // getting the iterator
        Iterator<String> iterator = cars.iterator();

        // accessing the first item
        System.out.println(iterator.next());

        // looping through an iterator
        while (iterator.hasNext()) System.out.println(iterator.next());

        // removing items from the collection with iterators
        while(iterator.hasNext()) if (iterator.next().equals("Volvo")) iterator.remove();
    }
}
