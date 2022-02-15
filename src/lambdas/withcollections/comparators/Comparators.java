package lambdas.withcollections.comparators;

import java.util.Comparator;

public class Comparators implements Comparator {

    /*
     * Comparator interface is a functional interface
     * since IComparator has only one abstract method
     * wich is compare()
     *
     * Comparator is used to define customized sorting
     * for Collections
     *
    */
    public static void main(String[] args) {

        // without lambda we have to provide an implementation class
        Comparators comparatorWithoutLambda = new Comparators();
        Integer compareReturn = comparatorWithoutLambda.compare(new Object(), new Object());
        System.out.println(compareReturn);

        // with lambda we don't need to provide an implementation class
        Comparator comparatorWithLambda = (firstObject, secondObject) -> {
            System.out.println(firstObject.toString());
            System.out.println(secondObject.toString());
            if (!firstObject.equals(secondObject)) return 1;
            return 0;
        };
        String firstObject = new String("first object");
        String secondObject = new String("second object");
        Integer comparatorWithLambdaReturn = comparatorWithLambda.compare(firstObject, secondObject);
        System.out.println(comparatorWithLambdaReturn);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
