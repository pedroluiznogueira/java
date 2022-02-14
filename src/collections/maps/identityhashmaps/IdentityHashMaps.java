package collections.maps.identityhashmaps;

import java.util.IdentityHashMap;

public class IdentityHashMaps {

    /*
     * hash maps don't allow duplicate keys
     * the way it happens is by checking if
     * keyOne.equals(keyTwo) so
     *
     * identity hash maps compare the keys
     * by using the == operator, that in Java
     * will check if two objects reference to
     * the same address in memory
     *
     * HashMap compare keys by value
     *
     * IdentityHashMap compare keys by reference
     *
    */
    public static void main(String[] args) {

        // comparision by reference
        String one = new String("one");
        String two = new String("one");
        Boolean isEqualsByReference = one == two;

        Object obj1 = new Object();
        Object obj2 = new Object();

        // comparision by value
        Boolean isEqualsByValue = one.equals(two);

        System.out.println("By reference ( == ) : " + isEqualsByReference);
        System.out.println("By value ( equals() ) : " + isEqualsByValue);

        // instanciating a hash map
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<String, Integer>();

        // by reference the keys will be added
        identityHashMap.put(one, 1);
        identityHashMap.put(two, 2);

        // by value the repeated one wont be added, will than substitue the other one
        identityHashMap.put("two", 3);
        identityHashMap.put("two", 4);

    }
}
