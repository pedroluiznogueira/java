package collections.sets.treesets;

import java.util.*;

public class TreeSets {

    /*
     * implements NavigableSet
     * stores only homogeneous elements
     * underlying data structure is a balanced tree
     * insertion will be done accourding to some
     * sorting order
     *
     * insertion goes following
     * the first element is the root, if the next inserted
     * is less than the root, goes to the left
     * if the it is greater than the root, goes to the right
     *
     * the generic class must implement the Comparable interface
     *
    */
    public static void main(String[] args) {

        // size 16 by default
        TreeSet<Integer> tsOne = new TreeSet<Integer>();

        // passing the comparator (Comparator c) to customize the order
        TreeSet<Integer> tsTwo = new TreeSet<Integer>();

        // passing a sorted set
        SortedSet<Integer> ssOne = new TreeSet<>();
        TreeSet<Integer> tsThree = new TreeSet<Integer>(ssOne);

        // coverting a collection to
        TreeSet<Integer> tsFour = new TreeSet<Integer>(new ArrayList<>());

        // arrange
        for (int i = 0; i < 20; i++) tsOne.add(i);
        System.out.println(tsOne);

    }
}
