package collections.arrays.multidimensional;

public class MultiDimensional {

    // array of a single dimensional array at each index
    public static void main(String[] args) {

        // singledimensional
        int[] firstArray = new int[2];
        firstArray[0] = 1;
        firstArray[1] = 2;

        int[] secondArray = new int[2];
        secondArray[0] = 1;
        secondArray[0] = 2;

        // multidimensional
        int[][] thirdArray = new int[2][];
        thirdArray[0] = firstArray;
        thirdArray[1] = secondArray;

        int[][][] fourthArray = new int[2][][];

        fourthArray[0] = new int[1][];
        fourthArray[1] = new int[1][];

        fourthArray[0][0] = new int[1];
        fourthArray[1][0] = new int[1];

        fourthArray[0][0][0] = 2;
        fourthArray[1][0][0] = 4;

        // looping through
        int[][] fithArray = new int[2][2];
        fithArray[0]= new int[2];
        fithArray[1]= new int[2];

        fithArray[0][0] = 1;
        fithArray[0][1] = 2;

        fithArray[1][0] = 3;
        fithArray[1][1] = 4;

        for (int[] oned: fithArray) {
            for (int element: oned) System.out.println(element);
        }
    }
}
