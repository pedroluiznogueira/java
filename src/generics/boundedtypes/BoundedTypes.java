package generics.boundedtypes;


import java.util.Arrays;
import java.util.List;

public class BoundedTypes {

    /*
     * if we need to bound the type of the
     * generic type
     *
     * the two use cases here are
     * first -> we are sorting the integer list
     * second -> we are sorting the string list
     *
     * imagine if the business rule was not to sort
     * the data if it isn't a Number
     *
     * we can use bounded types to bound T to be only
     * of type Number, meaning that only Number and it's
     * subclasses will be able to be T
     *
     * the syntax is <T extends BoundedType>
     *
     * the BoundedType can be interfaces, and since java provides
     * multiple implementation of interfaces, we can use
     * <T extends IntefaceOne & InterfaceTwo... InterfaceN>
     *
     * but we can't use multiple classes for the BoundeType, since
     * java doesn't allow multiple inheritance of classes
     *
    */
    public static void main(String[] args) {

        // arrange
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        // bounded types for generic classes
        GenericClass<Integer> genericClassOne = new GenericClass<>(integers);
        GenericClass<Double> genericClassTwo = new GenericClass<>(doubles);
        genericClassOne.getSortedData();
        genericClassTwo.getSortedData();

        // bounded types for generic methods
        GenericClass.getSortedDataBounded(integers);
        GenericClass.getSortedDataBounded(doubles);

        // bounded types for interfaces
        SomeInterfaceImpl someInterfaceImplOne = new SomeInterfaceImpl();
        SomeInterfaceImpl someInterfaceImplTwo = new SomeInterfaceImpl();
        List<SomeInterfaceImpl> listSomeInterface = Arrays.asList(someInterfaceImplOne, someInterfaceImplTwo);
        GenericClass.getSortedDataBoundedInterfaces(listSomeInterface);

    }
}

class GenericClass<T extends Number> {

    private List<T> list;

    public GenericClass(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void getSortedData() {
        list.sort(null);
        list.forEach(System.out::println);
    }

    public static <T extends Number> void getSortedDataBounded(List<T> list) {
        list.sort(null);
        list.forEach(System.out::println);
    }

    public static <T extends SomeInterface & AnotherSomeInterface> void getSortedDataBoundedInterfaces(List<T> list) {
        list.sort(null);
        list.forEach(System.out::println);
    }
}

interface SomeInterface {}

interface AnotherSomeInterface {}

class SomeInterfaceImpl implements SomeInterface, AnotherSomeInterface {}
