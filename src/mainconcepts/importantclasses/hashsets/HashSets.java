package mainconcepts.importantclasses.hashsets;

import java.util.HashSet;

public class HashSets {

    // flexible
    // don't insert intems in the inserted order
    // items are unique
    // are useful when you don't want duplicate items
    public static void main(String[] args) {

        // instanciating hash sets
        HashSet<String> cars = new HashSet<String>();

        // adding items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");

        // removing items
        cars.remove("Volvo");

        // removing all items from a hashset
        cars.clear();

        // hash set size
        cars.size();

        // looping through hashsets
        for (String car: cars) System.out.println(car);

        // check if an item exists
        Boolean containsValue = cars.contains("BMW");

        System.out.println(cars);


    }
}
