package collections.maps.weakhashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMaps {

    /*
     * HashMaps dominates over Garbage Collector
     *
     * WeakHashMap is dominated by Garbage Collector
     *
     * meaning that if a key don't reference any address
     * in memory, in other words, if a key is null
     * the garbage collector can collect this key
     * while in hash maps even if we call the garbage collector
     * the key won't be collected
     *
    */
    public static void main(String[] args) throws InterruptedException {

        SomeObject someObject = new SomeObject();

        Map<SomeObject, String> hashMap = new HashMap<SomeObject, String>();
        hashMap.put(someObject, "something");


        Map<SomeObject, String> weakHashMap = new WeakHashMap<SomeObject, String>();
        weakHashMap.put(someObject, "something");

        someObject = null;

        System.gc();
        Thread.sleep(3000);

        System.out.println(hashMap);
        System.out.println(weakHashMap);

    }
}

class SomeObject {

    public SomeObject() {
    }

    @Override
    public String toString() {
        return "temp";
    }

    public void finalize() {
        System.out.println("Finalized method called");
    }
}
