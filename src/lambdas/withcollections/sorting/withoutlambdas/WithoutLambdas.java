package lambdas.withcollections.sorting.withoutlambdas;

import java.util.*;

public class WithoutLambdas {

    public static void main(String[] args) {

        // natural sorting
        List<Integer> naturalSortingArrayList = new ArrayList<Integer>();
        naturalSortingArrayList.add(43);
        naturalSortingArrayList.add(3);
        naturalSortingArrayList.add(32);
        Collections.sort(naturalSortingArrayList);
        System.out.println(naturalSortingArrayList);


        // curstomized sorting
        List<Integer> customizedSortingArrayList = new ArrayList<Integer>();
        customizedSortingArrayList.add(43);
        customizedSortingArrayList.add(3);
        customizedSortingArrayList.add(32);
        Collections.sort(customizedSortingArrayList, new ComparatorImpl());
        System.out.println(customizedSortingArrayList);

    }
}

class ComparatorImpl implements Comparator {

    @Override
    public int compare(Object firstObject, Object secondObject) {
        Integer firstObjectConverted = (Integer) firstObject;
        Integer secondObjectConverted = (Integer) secondObject;

        if (firstObjectConverted > secondObjectConverted) return -1;
        if (firstObjectConverted < secondObjectConverted) return 1;
        return 0;
    }
}
