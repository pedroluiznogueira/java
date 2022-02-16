package generics.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    /*
     * the whole Collection framework was rewriten
     * after the generics for type safety purposes
     *
    */
    public static void main(String[] args) {

        // without generics may have class casting exceptions
        List listOne = new ArrayList();
        listOne.add("John");
        listOne.add(1);
        for (Object object: listOne) System.out.println(((String) object));

        // with generics at compile time the compiler verifies it for us
        List<String> listTwo = new ArrayList<String>();
        for (String object: listTwo) System.out.println(object);

    }
}
