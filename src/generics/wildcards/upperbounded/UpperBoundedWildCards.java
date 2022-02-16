package generics.wildcards.upperbounded;

import java.util.List;

public class UpperBoundedWildCards {

    /*
     * Upper Bounded WildCard : ? extends T
     *
    */
    public static void main(String[] args) {

        // wild card accepts Integer
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        displayList(integers);

        // wild card accepts Double
        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        displayList(doubles);

        // linked list without wild cards - we can't pass as next here a WithoutWildCards<Double>
        WithoutWildCards<Integer> firstNode = new WithoutWildCards<>(1, null);
        WithoutWildCards<Integer> secondNode = new WithoutWildCards<>(2, firstNode);
        WithoutWildCards<Integer> thirdNode = new WithoutWildCards<>(3, secondNode);
        WithoutWildCards<Integer> fourthNode = new WithoutWildCards<>(4, thirdNode);

        // linked list with wild cards
        WithoutWildCards<Integer> nodeOne = new WithoutWildCards<>(1, null);
        WithoutWildCards<Integer> nodeTwo = new WithoutWildCards<>(2, nodeOne);
        WithoutWildCards<Double> nodeThree = new WithoutWildCards<>(4.0, nodeTwo);
        WithoutWildCards<Integer> nodeFour = new WithoutWildCards<>(3, nodeThree);

    }

    public static void displayList(List<?> list) {
        list.forEach(System.out::println);
    }
}

class WithoutWildCards<E> {
    private E data;
    private WithoutWildCards<? extends Number> next;

    public WithoutWildCards(E data, WithoutWildCards<? extends Number> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public WithoutWildCards<? extends Number> getNext() {
        return next;
    }

    public void setNext(WithoutWildCards<? extends Number> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[ data: " + data + " next: " + next + " ]";
    }
}
