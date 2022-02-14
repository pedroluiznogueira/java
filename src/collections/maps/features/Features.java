package collections.maps.features;

import java.util.*;

public class Features {

    /*
     * used to stored key: value pairs
     * keys and values can be of any type
     *
     * duplicate keys are not allowed
     * duplicate values are allowed
     *
     * stores homogeneous and heterogeneous
     *
     * insertion order is not preserved
     *
    */
    public static void main(String[] args) {

        // HashMap
        Map hashMap = new HashMap();

        // LinkedHashMap extends HashMap
        Map linkedHashMap = new LinkedHashMap();
        HashMap anotherLinkedHashMap = new LinkedHashMap();

        // HashTable
        Map hashTable = new Hashtable();

        // Properties extends HashTable
        Map properties = new Properties();
        Hashtable anotherProperties = new Properties();

        // TreeMap
        Map treeMap = new TreeMap();

    }
}
