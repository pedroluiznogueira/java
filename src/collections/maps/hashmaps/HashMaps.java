package collections.maps.hashmaps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMaps {

    /*
     *
     * implements Serializable
     *
     * implements Cloneable
     *
     * extends AbstractMap
     *
     * recommended for searching operations
     * since under the hood it uses hash tables
     * that uses hashing technique to store data
     *
     * hashing is applied on the keys of the hash maps
     *
    */
    public static void main(String[] args) {

        // default size is 16, default load factor is 75%
        HashMap<String, Integer> hmOne = new HashMap();

        // passing the capacity
        HashMap<String, Integer> hmTwo = new HashMap(20);

        // passing the load facotr
        HashMap<String, Integer> hmThree = new HashMap(20, 0.80f);

        // passing a existing map
        Map<String, Integer> mOne = new HashMap<>();
        HashMap<String, Integer> hmFour = new HashMap(mOne);

        // Integer keyHashCode = 1.hashCode; Integer indexToBeStored = keyHashCode % hashMapSize;
        hmOne.put("keyOne", 1);

        // Integer keyHashCode = 2.hashCode; Integer indexToBeStored = keyHashCode % hashMapSize;
        hmOne.put("keyTwo", 2);

        // Integer keyHashCode = 3.hashCode; Integer indexToBeStored = keyHashCode % hashMapSize;
        hmOne.put("keyThree", 3);

        // Integer keyHashCode = 4.hashCode; Integer indexToBeStored = keyHashCode % hashMapSize;
        hmOne.put("keyFour", 3);

        // if two different keys results in the same hash code, they are stored in the resulted index, but in a linked list
        hmOne.put("FB", 4);
        hmOne.put("Ea", 5);

        // returns the value for the passed key
        hmOne.get("keyOne");

        // returns the hashmap size
        hmOne.size();

        // returns a set of all the keys of the hash map
        hmOne.keySet();

        // a set of all the entries of the hash map, meaning that each set element is each key: value pair together
        hmOne.entrySet();

        // returns all the values
        hmOne.values();

        // returns a copy of the map
        hmOne.clone();

        // checks if the passed key exists in the hash map
        hmOne.containsKey("keyOne");

        // checks if the passed value exists in the hash map
        hmOne.containsValue(3);

    }
}
