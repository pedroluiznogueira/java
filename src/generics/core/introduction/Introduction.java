package generics.core.introduction;

public class Introduction {

    /*
     * what if we want this data attribute
     * of the Data class to be of another
     * type
     *
     * with generics
     *
     * class SomeClass<T>
     * T - type parameter
     * this T means anything
     *
     * we can't do it for static attributes or methods
     * because generic type parameters works only for intances
     * of the class
     *
    */
    public static void main(String[] args) {

        // without generics
        WithoutGenerics withoutGenerics = new WithoutGenerics("attribute typed without generics");
        System.out.println(withoutGenerics.getAttributeOne());

        // with generics

        // passing as String
        WithGenerics<String> withGenerics = new WithGenerics<>("attribute typed with generics");
        System.out.println(withGenerics.getAttributeOne());

        // passing as integer
        WithGenerics<Integer> anotherWithGenerics = new WithGenerics<>(10);
        System.out.println(anotherWithGenerics.getAttributeOne());

    }
}

class WithoutGenerics {
    private String attributeOne;

    public WithoutGenerics(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(String attributeOne) {
        this.attributeOne = attributeOne;
    }

}

class WithGenerics<T> {
    private T attributeOne;

    public WithGenerics(T attributeOne) {
        this.attributeOne = attributeOne;
    }

    public T getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(T attributeOne) {
        this.attributeOne = attributeOne;
    }

}