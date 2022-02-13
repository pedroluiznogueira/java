package collections.core.hierarchy;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Hierarchy {

    public static void main(String[] args) {

        // the super interface
        Collection collection;

        // List interface

        // extends the Collection interface
        // insertion order preserver
        // duplicates allowed
        List list;

        // classes that implement List, subclasses
        ArrayList arrayList;
        LinkedList linkedList;
        Vector vector; Stack stack; // Stack extends Vector

        // Set interface

        // extends the Collection interface
        // insertion order is not preserved
        // duplicates are not allowed
        Set set;

        // classes/interfaces that implement/extend Set, subclasses/subinterfaces
        HashSet hashSet; LinkedHashSet linkedHashSet; // LinkedHashSet extends HashSet
        SortedSet sortedSet; NavigableSet navigableSet; TreeSet treeSet; // TreeSet implements NavigableSet that extends SortedSet

        // Queue interface

        // extends the Collection interface
        // prior to proccessment
        // first in first out order
        Queue queue;

        // classes that implement/extend Queue, subclasses
        PriorityQueue priorityQueue;
        BlockingQueue blockingQueue; LinkedBlockingQueue linkedBlockingQueue;PriorityBlockingQueue priorityBlockingQueue; // both implement BlockingQueue

        // Map interface

        // does not extend the Collection interface
        // key: value pairs
        Map map;

        // classes/interfaces that implement/extend Map, subclasses/subinterfaces
        HashMap hashMap; LinkedHashMap linkedHashMap; // LinkedHashMap extend HashMap
        WeakHashMap weakHashMap;
        IdentityHashMap identityHashMap;
        Dictionary dictionary; /* ---- */ Hashtable hashtable; Properties properties; // Properties extend HashTable that extends abstract Dictionary and implements Map
        SortedMap sortedMap; NavigableMap navigableMap; TreeMap treeMap; // TreeMap implements NavigableMap that extends SortedMap

    }
}
