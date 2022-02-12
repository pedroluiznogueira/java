package core.arrays;

public class Arrays {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        String[] list = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(list.length);

        String[] carsList = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < carsList.length; i++) {
            System.out.println(carsList[i]);
        }

        String[] listCars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : listCars) {
            System.out.println(i);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        int[][] numbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < numbers.length; ++i) {
            for(int j = 0; j < numbers[i].length; ++j) {
                System.out.println(numbers[i][j]);
            }
        }

    }
}
