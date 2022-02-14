package collections.sets.features;

import java.util.*;

public class Features {

    /*
     * don't contain new methods
     * contains only the implemented methods
     * from the interface Collection
     * an unordered collection
     * don't maintan the insertion order
     * don't allows duplicate values
     * can't be instanciated
     * we use it by instanciating the concret classes
     * wich implement the Set interface
     *
    */
    public static void main(String[] args) {

        // HashSet
        Set hashSet = new HashSet();

        // LinkedHashSet extends HashSet
        Set linkedHashSet = new LinkedHashSet();
        HashSet anotherLinkedHashSet = new LinkedHashSet();

        // SortedSet extends Set
        Set set; SortedSet sortedSet;

        // NavigableSet extends SortedSet that extends Set
        Set anotherSet; SortedSet anotherSortedSet; NavigableSet navigableSet;

        // TreeSet implements NavigableSet that extends SortedSet that extends Set
        Set firstTreeSet = new TreeSet();
        SortedSet secondTreeSet = new TreeSet();
        NavigableSet thirdTreeSet = new TreeSet();

    }
}
