package collections.core.generics;

import java.util.ArrayList;

public class Generics {

    // type safety
    // problems related to type casting in collections
    // write less redundant code
    public static void main(String[] args) {

        // without generics
        ArrayList arrayList = new ArrayList();
        arrayList.add("accepts strings");
        arrayList.add(1);
        String dangerAccessedItem = (String) arrayList.get(1);

        // with generics
        ArrayList<String> anotherArrayList = new ArrayList<String>();
        anotherArrayList.add("accepts only strings");
        String safeAccessedItem = anotherArrayList.get(0);

    }
}
