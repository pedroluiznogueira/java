package collections.maps.linkedhashmaps;

import java.util.LinkedHashMap;

public class LinkedHashMaps {

    /*
     * insertion order is preserved
     *
     * used for creating cache based applications
    */
    public static void main(String[] args) {

        // arrange
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        // insertion order preserved
        linkedHashMap.put(2, "two");
        linkedHashMap.put(5, "five");
        linkedHashMap.put(3, "three");
        linkedHashMap.put(1, "one");
        linkedHashMap.put(4, "four");

    }
}
