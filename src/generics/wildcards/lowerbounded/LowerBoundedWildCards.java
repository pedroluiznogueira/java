package generics.wildcards.lowerbounded;

import java.util.List;

public class LowerBoundedWildCards {

    /*
     * Lower Bounded WildCard : ? super T
     *
    */
    public static void main(String[] args) {

        // arrange
        SuperClass<String> superClassOne = new SuperClass<>("first");
        SuperClass<String> superClassTwo = new SuperClass<>("second");
        List<SuperClass> list = List.of(superClassOne, superClassTwo);

        // LowerBounded <? super LowerBoundedType> means that the list must be any list of super types of SubClass
        displayData(list);
    }

    public static void displayData(List<? super SubClass> list) {
        list.forEach(System.out::println);
    }
}

class SuperClass<T> {
    private T superAttribute;

    public SuperClass() {
    }

    public SuperClass(T superAttribute) {
        this.superAttribute = superAttribute;
    }

    public T getSuperAttribute() {
        return superAttribute;
    }

    public void setSuperAttribute(T superAttribute) {
        this.superAttribute = superAttribute;
    }

    @Override
    public String toString() {
        return "super attribute " + superAttribute;
    }
}

class SubClass<T> extends SuperClass<T> {
    private T subAttribute;

    public SubClass(T subAttribute) {
        this.subAttribute = subAttribute;
    }

    public T getSubAttribute() {
        return subAttribute;
    }

    public void setSubAttribute(T subAttribute) {
        this.subAttribute = subAttribute;
    }
}