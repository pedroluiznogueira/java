package collections.arrays.creation;

public class Creation {

    public static void main(String[] args) {

        // initializing
        int[] firstArray = {1, 2};

        // each element is initialized with the value zero
        int[] secondArray = new int[3];
        System.out.println(secondArray[0]);
        secondArray[0] = 10;

        // thirdArray -> array that has two single dimensional arrays inside
        // the next level array doesn't have the size declared, so it is null
        // you can't access thirdArray[0][0], leads to NullPointerException
        // everytime you operate in null, leads to NullPointerException
        int[][] thirdArray = new int[2][];
        int[][] fourthArray = new int[2][1];

        // declaring and initializing
        int[][] fithArray = {{1, 2, 3}, {1, 2}};
    }
}
