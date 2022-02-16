package generics.inheritance.onlygenerics;

public class OnlyGenericsInheritance {

    public static void main(String[] args) {

        // it works if the generic type is the same
        GenericInterfaceImpl<String> genericClassImpl = new GenericInterfaceImpl<>();
        GenericClass<String> genericClass = genericClassImpl;

    }
}

class SuperGenericClass<T> {
}

class GenericClass<T> extends SuperGenericClass<T> {
}

interface SuperGenericInterface<T> {
}

interface GenericInteface<T> extends SuperGenericInterface<T> {
}

class GenericInterfaceImpl<T> extends GenericClass<T> implements GenericInteface<T> {

}