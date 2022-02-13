package collections.lists.arraylists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayLists {

    /*
     * implements Serializable
     * wich allows us to move objects
     * from one place to another
     *
     * implements Cloneable
     * wich allows us to operate in a clone of the objects
     * preserving the actual object
     *
     * implements RandomAccess
     * wich is just a marker to indicate fast random access
     * so any element can be accessed in the same speed
     *
     * proccess of adding an element
     * a new list is created, with the new size
     * the garbage colector handles the old list
     * you get a new list with the added element
     *
     * not recommended to perform insertions
     * since every time you insert an element
     * the list will trigger the procces of adding
     *
     * not recommended to perform deletions aswell
     * for the same reason
     *
     * recommended to perform access for the data
     * since it implements the RandomAccess interface
     *
    */
    public static void main(String[] args) {

        List<Integer> alOne = new ArrayList<>();

        // setting the initial value
        List<Integer> alTwo = new ArrayList<>(30);

        // casting a collection to another
        List<Integer> alThree = new ArrayList<>(new HashSet<>());

        // add
        alOne.add(2);

        // remove
        alOne.remove(1);

        // get
        alOne.get(1);

    }
}
