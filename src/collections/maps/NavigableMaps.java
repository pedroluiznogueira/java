package collections.maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMaps {

    /*
     * both SortedMap and NavigableMap have
     * as implementation class TreeMap
     *
    */
    public static void main(String[] args) {

        // instanciating
        NavigableMap<String, Integer> nmOne = new TreeMap<String, Integer>();

        // arrange
        nmOne.put("ABC", 123);
        nmOne.put("DEF", 456);
        nmOne.put("HIJ", 789);
        nmOne.put("MNO", 546);
        nmOne.put("PQR", 776);
        nmOne.put("XYZ", 775);

        // returns an entry with the least key greater than or equal to key, or null if there is no such key
        nmOne.ceilingEntry("HIJ");

        // returns the greatest key less than or equal to key, or null if there is no such key
        nmOne.floorKey("PQR");

        // returns the least key greater than key, or null if there is no such key
        nmOne.higherKey("ABC");

        // returns the greatest key less than key, or null if there is no such key
        nmOne.lowerKey("PQR");

        // returns the least key greater than or equal to key, or null if there is no such key
        nmOne.ceilingKey("XYZ");

        // returns a reverse order navigable set view of the keys in this map
        nmOne.descendingKeySet();

        // returns a reverse order view of this map
        nmOne.descendingMap();

        // returns a view of the portion of this map whose keys are strictly less than toKey
        nmOne.headMap("JKL");

        // a view of the portion of this map whose keys are less than (or equal to, if inclusive is true) toKey
        nmOne.headMap("JKL", true);

        // a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive
        nmOne.subMap("PQR", "XYZ");

        // a view of the portion of this map whose keys range from fromKey to toKey
        nmOne.subMap("ABC", true, "PQR", false);

        // a view of the portion of this map whose keys are greater than or equal to fromKey
        nmOne.tailMap("JKL");

        // a view of the portion of this map whose keys are greater than (or equal to, if inclusive is true) fromKey
        nmOne.tailMap("PQR", false);

        // returns an entry with the least key greater than key, or null if there is no such key
        nmOne.higherEntry("STU");

        // returns a navigable set view of the keys in this map
        nmOne.navigableKeySet();

    }
}
