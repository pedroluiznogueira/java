package collections.arrays.referencing;

public class Referencing {

    public static void main(String[] args) {

        // two variables referencing the same array in memory
        // if you change the value in memory the two variables will be affected
        int[] firstArray = new int[2];
        int[] secondArray = firstArray;
        firstArray[0] = 1;
        System.out.println(firstArray[0]);
        System.out.println(secondArray[0]);
        secondArray[1] = 2;
        System.out.println(firstArray[1]);
        System.out.println(secondArray[1]);

        // assigning a declared array to another
        // thirdArray -> {1, 2, 3}
        // fourthArray -> {4, 5, 6}
        // fourthArray = thirdArray
        // fourthArray -> {1, 2, 3}
        int[] thirdArray = {1, 2, 3};
        int[] fourthArray = {4, 5};
        fourthArray = thirdArray;
        System.out.println(fourthArray.length);

        // automatic typecasting can't be done from an array type to another
        // short[] is an object of [S
        // int[] is an object of [I
        short[] sixthArray = new short[2];
        int[] seventh = new int[2];
        // seventh = sixthArray;
    }
}
