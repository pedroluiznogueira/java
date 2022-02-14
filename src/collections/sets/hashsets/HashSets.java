package collections.sets.hashsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSets {

    /*
     * implements Serializable
     * wich allows us to move objects
     * from one place to another
     *
     * implements Cloneable
     * wich allows us to operate in a clone of the objects
     * preserving the actual object
     *
     * recommended for searching because objects
     * are stored in hashing
     *
     * underlying data structure is a hash table
     * when adding an object, every object will
     * have it's own hashcode
     *
     * works with load factor, by default the load factor
     * creates a new hash set, with the double of the size
     * of the previous one, every time 75% of the size is
     * occupied
     *
    */
    public static void main(String[] args) {

        // size 16 by default
        Set<Integer> hsOne = new HashSet<Integer>(20);

        // specifying the size
        Set<Integer> hsTwo = new HashSet<Integer>(30);

        // providing the load factor
        Set<Integer> hsThree = new HashSet<Integer>(100, .80f);

        // creating a hash set from another collection
        Set<Integer> hsFour = new HashSet<Integer>(new ArrayList<>());

        // insertion order may/ may not be preserved
        for (int i = 0; i < 20; i++) hsOne.add(i);

    }
}
