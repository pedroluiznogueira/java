package collections.lists.stacks;

import java.util.Stack;

public class Stacks {

    /*
     * Stack is a child class of Vector
     *
     * the underlying data structure is a stack
     *
     * follows last in first out (LIFO)
     *
     * -> insertion direction
     * => thirdInserted(2) => secondInserted(1) => firstInserted(0)
     * last in (thirdInserted(2)) is the first get out (LIFO)
     *
    */
    public static void main(String[] args) {

        // only constructor
        Stack<Integer> stackOne = new Stack<Integer>();

        // adding items
        stackOne.push(1);
        stackOne.push(2);
        stackOne.push(3);
        stackOne.push(4);
        stackOne.push(5);
        stackOne.push(6);

        // following LIFO, returns the lastItemInserted and removes it from the stack
        Integer lastItemInserted = stackOne.pop();

        // returns the topItem of the stack but don't remove it from the stack
        Integer topItem = stackOne.peek();

        // returns true if the stack is empty, otherwise returns false
        Boolean isEmpty = stackOne.empty();

        // returns the index of the object, counting from 1, with 1 beign the index of the top, if it isn't found returns -1
        Integer foundElement = stackOne.search(2);

    }
}
