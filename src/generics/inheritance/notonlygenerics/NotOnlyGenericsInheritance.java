package generics.inheritance.notonlygenerics;

public class NotOnlyGenericsInheritance {

    /* NonGenericClass implements GenericInterface<T>
     * for a non generic class to implement a
     * generic interface, you have to specify
     * the generic type when implementing it
     *
     * GenericClass<T> implements NonGenericInterface
     * no need to specify the generic type
     *
     * GenericClass<T> extends NonGenericClass
     * no nedd to specify the generic type
     *
     * NonGenericClass extends GenericClass<T>
     * you have to specify the generic type
     *
     * GenericClass<T> implements GenericInterface<T> and
     * extends AnotherGenericClass<T> that algo implements
     * the same GenericInterface<T>
     * in this case we can't specify different generic types
     * in the two implemententions of the GenericInterface<T>
     * in both GenericClass<T> and AnotherGenericClass<T> we
     * have to implement it with the same T type
     *
    */
    public static void main(String[] args) {

    }
}

// NonGenericClass implements GenericInterface<T>

interface GenericInterface<T> {
}

class NonGenericClass implements GenericInterface<Integer> {
}

// GenericClass<T> implements NonGenericInterface

interface NonGenericInterface {
}

class GenericClass<T> implements NonGenericInterface {
}

// GenericClass<T> extends NonGenericClass

class AnotherGenericClass<T> extends NonGenericClass {
}

// NonGenericClass extends GenericClass<T>

class AnotherNonGenericClass extends GenericClass<Integer> {
}

// GenericClass<T> implements GenericInterface<T> and extends AnotherGenericClass<T> that algo implements the same GenericInterface<T>

interface SomeGenericInterface<T> {
}

class SomeGenericClass<T> implements SomeGenericInterface<Integer> {
}

class AnotherSomeGenericClass<T> extends SomeGenericClass<T> implements SomeGenericInterface<Integer> {
}