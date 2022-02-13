package collections.lists.features;

import java.util.*;

public class Features {

    /*
    * an ordered collection
    * maintan the insertion order
    * allows duplicate values
    * can't be instanciated
    * we use it by instanciating the concret classes
    * wich implement the List interface
    */
    public static void main(String[] args) {

        // ArrayList
        List arrayList = new ArrayList();

        // LinkedList
        List linkedList = new LinkedList();

        // Vector
        List vector = new Vector();

        // Stack extends Vector
        List stack = new Stack();
        Vector anotherStack = new Stack();

    }
}
