package collections.core.overview;

import java.util.ArrayList;
import java.util.List;

public class Overview {

    public static void main(String[] args) {

        // arrays
        // fixed in size
        // holds only homogeneous types
        // not recommended in the memory point of view, because once memory is allocated it won't change, leading to wastage
        // there are no built in data structure, once arrays itself are data structures
        // holds primitive and object types
        int[] someArray = new int[2];

        // collections
        // flexible in size
        // holds only homogeneous and heterogeneus types
        // recommended in the memory point of view, because solves the memory wastage problem, once it grows or shrinks on demmand
        // there are many built in data structures
        // there are many algorithms built in it's classes, implemented in it's methods
        // holds only object types
        List<Integer> someList = new ArrayList<>();
    }
}
