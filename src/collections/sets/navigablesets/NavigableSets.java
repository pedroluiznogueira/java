package collections.sets.navigablesets;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSets {

    /*
     * extends SortedSet
     * methods related to navigation
     * used to report the closest match
     * for a given search, target or element
     *
     */
    public static void main(String[] args) {

        // size 16 by default
        NavigableSet<Integer> nsOne = new TreeSet<Integer>();

        // arrange
        for (int i = 0; i < 20; i++) nsOne.add(i);

        System.out.println(nsOne);

        // returns the greatest element less than or equal to e, or null if there is no such element
        nsOne.floor(4);

        // returns the greatest element in this set strictly less than the given element, or null if there is no such element
        nsOne.lower(4);

        // returns the least element in this set greater than or equal to the given element, or null if there is no such element
        nsOne.ceiling(3);

        // returns the least element in this set strictly greater than the given element, or null if there is no such element
        nsOne.higher(6);

        // retrieves and removes the first (lowest) element, or returns null if this set is empty
        nsOne.pollFirst();

        // retrieves and removes the last (highest) element, or returns null if this set is empty
        nsOne.pollLast();

        // returns a reverse order view of this set
        nsOne.descendingSet();

    }
}
