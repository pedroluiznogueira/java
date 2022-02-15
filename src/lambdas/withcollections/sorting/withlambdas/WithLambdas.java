package lambdas.withcollections.sorting.withlambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithLambdas {

    public static void main(String[] args) {

        // customized sorting with lambdas

        // arrange
        List<Integer> customizedSortingArrayList = new ArrayList<Integer>();
        customizedSortingArrayList.add(43);
        customizedSortingArrayList.add(3);
        customizedSortingArrayList.add(32);

        // explicit usting functional interfaces
        Comparator comparatorWithLambda = (firstObject, secondObject) -> {
            Integer firstObjectConverted = (Integer) firstObject;
            Integer secondObjectConverted = (Integer) secondObject;
            if (firstObjectConverted > secondObjectConverted) return -1;
            if (firstObjectConverted < secondObjectConverted) return 1;
            return 0;
        };

        // implicit using functional interfaces
        Collections.sort(customizedSortingArrayList, (firstObject, secondObject) -> {
            if (firstObject > secondObject) return -1;
            if (firstObject < secondObject) return 1;
            return 0;
        });

    }
}
