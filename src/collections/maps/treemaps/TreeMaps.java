package collections.maps.treemaps;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMaps {

    /*
     * the underlying data structure is a
     * red black tree
     *
     * good for insertion or deletion
     *
     * insertion order is not preserved
     * duplicate keys are not allowed
     * duplicate values are allowed
     * for default sorting order keys
     * should be homogeneous and comparable
     * for customized order it doesn't matter
     *
    */
    public static void main(String[] args) {

        // default sorting order of keys
        TreeMap<String, Integer> tmOne = new TreeMap<String, Integer>();

        // passing comparator for customized order, new TreeMap<String, Integer>(ComparatorImpl c);
        TreeMap<String, Integer> tmTwo = new TreeMap<String, Integer>();

        // passing a sorted map
        SortedMap<String, Integer> smOne = new TreeMap<String, Integer>();
        TreeMap<String, Integer> tmThree = new TreeMap<String, Integer>(smOne);

        // passing a map
        Map<String, Integer> mOne = new HashMap<String, Integer>();
        TreeMap<String, Integer> tmFour = new TreeMap<String, Integer>(mOne);

        tmOne.put("a", 1);
        tmOne.put("b", 2);
        tmOne.put("c", 3);

    }
}
