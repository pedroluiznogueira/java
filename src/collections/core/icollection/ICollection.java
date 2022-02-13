package collections.core.icollection;

import java.util.*;

public class ICollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        // add to
        list.add(1);
        set.add(2);

        // remove from
        list.remove(0);
        set.remove(0);

        // add all to
        list.addAll(new ArrayList<Integer>());
        set.addAll(new HashSet<Integer>());

        // remove all elements corresponding to the collection passed, from the invoking collection
        list.removeAll(new ArrayList<Integer>());
        set.removeAll(new HashSet<Integer>());

        // oposite from removeAll, retains all the elements corresponging to the collection passed, from the invoking collection
        list.retainAll(new ArrayList<Integer>());
        set.retainAll(new HashSet<Integer>());

        // remove all from the colection
        list.clear();
        set.clear();

        // check if an element is present in the collection
        list.contains(1);
        set.contains(2);

        // check if all the elements from the passed collection are present in the invoking collection
        list.containsAll(new ArrayList<Integer>());
        set.containsAll(new HashSet<Integer>());

        // checks if the collection is empty
        list.isEmpty();
        set.isEmpty();

        // retrieves the size of the collection
        list.size();
        set.size();

        // provides an iterator for the invoking collection
        Iterator<Integer> listIterator = list.iterator();
        Iterator<Integer> setIteratorset = set.iterator();

        // convert a collection to an array
        Integer[] listAsArray = (Integer[]) list.toArray();
        Integer[] setAsArray = (Integer[]) set.toArray();

    }

}
