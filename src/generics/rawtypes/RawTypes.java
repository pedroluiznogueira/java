package generics.rawtypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RawTypes {

    /*
     * when not specifying the generic type
     * we are actually using the raw type
     *
     * that is used to preserve the compatibility
     * of version of java that don't support generics
     *
    */
    public static void main(String[] args) {

        // without raw type
        GenericClass<Integer> genericClass = new GenericClass<>(List.of(1, 2, 3));
        genericClass.getList().forEach(System.out::println);

        // with raw type
        GenericClass genericClassOne = new GenericClass(List.of(1, 2, "not passing the specified type"));
        genericClassOne.getList().forEach(System.out::println);
    }
}

class GenericClass<T> {

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
}
