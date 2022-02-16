package generics.wildcards.restrictions;

import java.util.List;

public class Restrictions {

    /*
     * 1.
     * can't be used as type parameter in generic class declaration
     * for example, public class GenericClass<?> {} - not valid
     *
     * 2.
     * wild cards don't support multiple type parameters
     * for example, List<? extends TypeOne & TypeTwo>
     *
     * 3.
     * we can't perform write or delete operations when wildcards
     * are used as Unbounded "List<?>" to represent the generic type
     * of the object that you using, because the compiler don't know
     * what type it is
     *
    */
    public static void main(String[] args) {

    }

    // 3. it works because the lower bounded is Integer and you are passing Integer
    public static void displayList(List<? super Integer> list) {
        list.add(1);
    }
}
