package collections.lists.vectors;

import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Vectors {

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
     * adding proccess is different than arraylists
     * because with vectors a new vector is created
     * with the double of the size of the previous
     *
     * not recommended to perform deletions aswell
     * for the same reason
     *
     * recommended to perform access for the data
     * since it implements the RandomAccess interface
     *
     * difference between Vector and ArrayList is that
     * vectors are thread-safe, meaning that they are
     * syncronized, so only one thread can access
     * a method at a time
     *
     * performance is low due to beign thread-safe
     *
    */
    public static void main(String[] args) {

        // initial size is 10
        List<Integer> vOne = new Vector<Integer>();

        // avoids the new vector size to be the previous one doubled when adding, instead of initialCapacity * 2 it will be initialCapacity + capacityIncrement
        List<Integer> vTwo = new Vector<Integer>(20, 1);

        // setting the initial value
        List<Integer> vThree = new Vector<>(30);

        // casting a collection to another
        List<Integer> vFour = new Vector<>(new HashSet<>());

        // add
        vTwo.add(2);

        // remove
        vTwo.remove(1);

        // get
        vTwo.get(1);

    }
}
