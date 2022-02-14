package collections.sets.icomparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorImpl implements Comparator {

    /*
     * meant for customized order
     *
     * you can pass a customized implementation
     * of the compare method
     *
     * implementation of equals is not required
     * because every class extends Object by default
     * under the hood
     *
    */

    @Override
    public int compare(Object firstObject, Object secondObject) {
        Integer firstInteger = (Integer) firstObject;
        Integer secondInteger = (Integer) secondObject;

        // the default returns -1 for this condition
        if (firstInteger < secondInteger) return +1;

        // the default returns +1 for this condition
        if (firstInteger > secondInteger) return -1;

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class ComparatorUseCase {

    /*
     * remeber that one of the constructors of TreeSet recieves a Comparator
     * meaning that it recieves any class that implements Comparator
     * so it will use it's own implementation of the compare() method
     *
     * once we pass a class that implements Comparator
     * JVM will go for the compare() method instead of compareTo()
     *
    */
    public static void main(String[] args) {

        Comparator comparatorImpl = new ComparatorImpl();
        TreeSet<Integer> tsOne = new TreeSet<Integer>(comparatorImpl);

        // it will add 2 as the root
        tsOne.add(2);

        // it will call 2.compare(1), if it is less goes to the right, if it is greater goes to the left
        tsOne.add(1);

        // it will call 1.compare(3), than call next.compare(3) if it is less goes to the right, if it is greater goes to the left
        tsOne.add(3);

        System.out.println(tsOne);

    }
}
