package collections.arrays.singledimensional;

public class SingleDimensional {

    // not flexible
    // the length must be provided
    // the length is fixed
    // holds only variables of the same type
    public static void main(String[] args) {

        // arrays are treated as objects for every primitive data type
        int[] firstArray = new int[1000];
        System.out.println(firstArray.getClass().getName());

        // ascii value of char as array size
        int[] secondArray = new int['c'];
        System.out.println(secondArray.length);

        // memory required
        Integer arrayLength = 20;
        Integer bytesForEachIntElement = 4;
        Integer usedMemory = arrayLength * bytesForEachIntElement;
        int[] thirdArray = new int[arrayLength];
        System.out.println(usedMemory);

        // looping through
        int[] fourthArray = {1, 2, 3, 4};
        for (int number: fourthArray) System.out.println(number);
    }
}
