package collections.arrays.anonymous;

public class Anonymous {

    public static void main(String[] args) {

        // the anonymous array is passed without beign declared and instanciated
        sum(new int[] {1, 2, 3});
    }

    public static void sum(int[] numbers) {
        int sum = 0;
        for (int number: numbers) sum += number;

        System.out.println(sum);
    }
}
