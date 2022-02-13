package collections.lists.cursors;

import java.util.*;

public class Cursors {

    /*
     *
     * it's just a way of iterating data
     *
     * Enumeration works only on Legacy Collections
     * wich are Vector and Stack
     * (Read)
     *
     * Iterator works for any Collection
     * (Read and Remove)
     *
     * ListIterator works only for List Collections
     * ListIterator extends Iterator
     * ListIterator works for iterating forward and backward
     * (Read, Remove, Replace and Add)
     *
    */
    public static void main(String[] args) {

        // arrange
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 1; i <= 10; i++) vector.addElement(i);

        // creating an enumeration of the elements in the vector or stack
        Enumeration<Integer> enumeration = vector.elements();

        // looping and accessing the elements in the enumeration
        while (enumeration.hasMoreElements()) System.out.println(enumeration.nextElement());

        // arrange
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) linkedList.add(i);

        // creating an iterator of the elements in the collection
        Iterator<Integer> iterator = linkedList.iterator();

        // looping and accessing the elements in the iterator
        while(iterator.hasNext()) System.out.println(iterator.next());

        // removing an element
        while(iterator.hasNext()) if (iterator.next() % 2 == 0) iterator.remove();

        // arrange
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) arrayList.add(i);

        // creating a listIterator of the elements in the list collection
        ListIterator<Integer> listIterator = arrayList.listIterator();

        // forward direction iteration
        while (listIterator.hasNext()) System.out.println(listIterator.next());

        // backward direction iteration
        while(listIterator.hasPrevious()) System.out.println(listIterator.previous());
    }
}
