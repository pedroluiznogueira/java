package generics.subtyping;

import java.util.List;

public class SubTyping {

    /*
     * type casting of sub types
     * is the same thing of attributing
     * an integer to a double varible
     *
     * you can pass the super generic type
     * and use the child types
     *
     * not subtype - List<Number> list = new ArrayList<Integer>();
     *
    */
    public static void main(String[] args) {

        // sub type
        List<Number> list = List.of(1, 2.3, 3, 4.8, 5);

    }
}
