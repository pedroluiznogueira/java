package collections.lists.linkedlists;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedLists {

    /*
     * every element has a data part and an address part
     * these element consists in a node
     *
     * every node is linked using pointers
     * pointing to the next node
     *
     * methods ...First() and ...Last()
     * are used for Stacks(LIFO) and Queues(FIFO)
     *
    */
    public static void main(String[] args) {

        LinkedList<String> llOne = new LinkedList<String>();
        llOne.add("um");

        // create a LinkedList from another collection
        LinkedList<String> llTwo = new LinkedList<String>(new HashSet<String>());

        // add
        llOne.add("dois");

        // update an object
        llOne.set(1, "quatro");

        // adds in the specific index, growing the list
        llOne.add(1, "tres");

        // get first
        llOne.getFirst();

        // get last
        llOne.getLast();

        // add first
        llOne.addFirst("add first");

        // add last
        llOne.addLast("add last");

        // remove first
        llOne.removeFirst();

        // remove last
        llOne.removeLast();

    }
}
