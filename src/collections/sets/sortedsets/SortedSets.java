package collections.sets.sortedsets;

import java.util.*;

public class SortedSets {

    /*
     * extends Set
     * different than HashSet, insertion should be done
     * accourdingly to some insertion order
     * accepts only homogeneous elements since heteregeneous
     * elements can't be sorted in some order
     *
     */
    public static void main(String[] args) {

        // size 16 by default
        SortedSet<Integer> ssOne = new TreeSet<Integer>();

        // arrange
        for (int i = 0; i < 20; i++) ssOne.add(i);

        // retrives the first element
        ssOne.first();

        // retrieves the last element
        ssOne.last();

        // returns a sub set with all the elements before the value you pass (exclusive)
        ssOne.headSet(14);

        // returns a sub set with all the elements after the value you plass (inclusive)
        ssOne.tailSet(12);

        // returns a sub set with all the elements between firstValue (inclusive) and the secondValue (exclusive)
        ssOne.subSet(2, 12);

        // returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements
        ssOne.comparator();

    }
}
