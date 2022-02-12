package importantclasses.linkedlists;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedLists {

    // can contain many objects of the same type
    // flexible
    // stores items in the inserted order
    // implement List, add(), remove(), set(), clear(), get()...
    // the LinkedList store items in containers, each container points to the next
    // when adding a new container is created to place the new item inside of it
    // useful for manipulating data in specific ways
    public static void main(String[] args) {

        // instanciating linked lists
        LinkedList<String> cars = new LinkedList<String>();
        LinkedList<Integer> numbers = new LinkedList<Integer>();

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

        // looping through linked lists
        for (int i = 0; i < cars.size(); i++) System.out.println(cars.get(i));
        for (String car: cars) System.out.println(car);

        // sorting alphabetically or numerically
        Collections.sort(cars);
        Collections.sort(numbers);

        cars.add("Volvo");
        cars.add("BMW");

        // adding an item to the beginning of the list
        cars.addFirst("Ford");

        // adding an item to the end of the list
        cars.addLast("Audi");

        // removing an item from the beginning of the list
        cars.removeFirst();

        // removing an item from the end of the list
        cars.removeLast();

        // get the item at the beginning of the list
        cars.getFirst();

        // get the item at the end of the list
        cars.getLast();

        System.out.println(cars);
    }
}
