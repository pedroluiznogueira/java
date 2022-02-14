package collections.queues.priorityqueues;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueues {

    /*
     * insertion order is not preserved
     * since the elements are inserted
     * accourdingly to some priority
     *
     * duplicates are not allowed
     *
    */
    public static void main(String[] args) {

        // size 11 by default, priority by default is natural sorting order
        PriorityQueue<Integer> pqOne = new PriorityQueue<Integer>();

        // passing initial capacity
        PriorityQueue<Integer> pqTwo = new PriorityQueue<Integer>(20);

        // passing comparator object new PriorityQueue(ComparatorImpl)
        PriorityQueue<Integer> pqThree = new PriorityQueue<Integer>(20);

        // passing a sorted set
        SortedSet ssOne = new TreeSet();
        PriorityQueue<Integer> pqFour = new PriorityQueue<Integer>(ssOne);

        // passing collection to be converted
        PriorityQueue<Integer> pqFive = new PriorityQueue<Integer>(new ArrayList<Integer>());

        // arrange
        for (int i = 0; i < 10; i++) pqOne.add(i);

        System.out.println(pqOne);

        // inserts the specified element into this priority queue
        pqOne.offer(2);

        // removes a single instance of the specified element from this queue, if it is present
        pqOne.remove(2);

        // retrieves and removes the head of this queue, or returns null if this queue is empty
        pqOne.poll();

        // retrieves, but does not remove, the head of this queue
        pqOne.element();

        // retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        pqOne.peek();

    }
}
