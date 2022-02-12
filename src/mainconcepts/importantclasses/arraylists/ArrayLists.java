package mainconcepts.importantclasses.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    // can contain many objects of the same type
    // flexible
    // stores items in the inserted order
    // implement List, add(), remove(), set(), clear(), get()...
    // there is a regular array inside of it, replacing the previous with a new one when adding
    // useful for storing and accessing data
    public static void main(String[] args) {

        // instanciating array lists
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // adding items
        cars.add("Volvo");
        cars.add("BMW");

        // accessing items
        String returnedCar = cars.get(0);

        // changing items
        cars.set(0, "Ford");

        // removing items
        cars.remove(0);

        // removing all elements
        cars.clear();

        // array list size
        cars.size();

        // looping through array list
        for (int i = 0; i < cars.size(); i++) System.out.println(cars.get(i));
        for (String car: cars) System.out.println(car);

        // sorting alphabetically or numerically
        Collections.sort(cars);
        Collections.sort(numbers);

        System.out.println(cars);
    }
}
