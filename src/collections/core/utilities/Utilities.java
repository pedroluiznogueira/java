package collections.core.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> anotherList = new ArrayList<Integer>();
        anotherList.add(5);
        anotherList.add(6);
        anotherList.add(7);
        anotherList.add(8);

        // reverse the collection
        Collections.reverse(list);

        // shuffles the collection
        Collections.shuffle(list);

        // sort the collection
        Collections.sort(list);

        // perform binarySearch in the list, searching for a specific object and return it's index if found
        Collections.binarySearch(list, 2);

        // return true if the two passed collection have any objects in common, and false otherwise
        Collections.disjoint(list, anotherList);

    }
}
