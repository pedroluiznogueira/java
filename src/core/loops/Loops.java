package core.loops;

public class Loops {

    public static void main(String[] args) {

        // while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do while
        int j = 0;
        do {
            System.out.println(i);
            j++;
        }
        while (j < 5);

        // for
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // for each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        // breaking out of a loop
        for (int index = 0; index < 10; index++) {
            if (index == 4) {
                break;
            }
            System.out.println(index);
        }

        // breaking out based on conditions using continue
        for (int iterator = 0; iterator < 10; iterator++) {
            if (iterator == 4) {
                continue;
            }
            System.out.println(iterator);
        }

    }
}
