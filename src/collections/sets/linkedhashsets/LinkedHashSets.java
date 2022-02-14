package collections.sets.linkedhashsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {

    /*
     * extends HashSet
     * insertion order is preserved, different than HashSet
     * underlying data structure is a combination of
     * linkedlists and a hashtable
     *
    */
    public static void main(String[] args) {

        // size 16 by default
        Set<Integer> lhsOne = new LinkedHashSet<Integer>();

        // specifying the size
        Set<Integer> lhsTwo = new LinkedHashSet<Integer>(30);

        // providing the load factor
        Set<Integer> lhsThree = new LinkedHashSet<Integer>(100, .80f);

        // creating a hash set from another collection
        Set<Integer> lhsFour = new LinkedHashSet<Integer>(new ArrayList<>());

        // insertion order is preserved
        for (int i = 0; i < 20; i++) lhsOne.add(i);

    }
}
