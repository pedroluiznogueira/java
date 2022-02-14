package collections.sets.icomparable;

import java.util.TreeSet;

public class ComparableImpl implements Comparable {

    /*
     * meant for default natural sorting order
     *
     * it is used under the hood when adding by default
     * in a tree set, in the balanced tree
     *
     * by default JVM will use the compateTo() method
     *
    */
    public static void main(String[] args) {

        // arrange
        TreeSet<Integer> tsOne = new TreeSet<Integer>();

        // it will add 2 as the root
        tsOne.add(2);

        // it will call 2.compareTo(1), if it is less goes to the left, if it is greater goes to the rigth
        tsOne.add(1);

        // it will call 1.compareTo(3), than call next.compareTo(3) if it is less goes to the left, if it is greater goes to the rigth
        tsOne.add(3);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
