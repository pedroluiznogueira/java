package designprinciples.dry;

public class Dry {

    /*
     * - don't write duplicate code
     * - abstraction helps on it
     *
    */
    public static void main(String[] args) {

    }
}

class Laundry {

    public void washWhiteClothes() {
        // reusability of code
        performCommonTasks();
    }

    public void washColorfulClothes() {
        // reusability of code
        performCommonTasks();
    }

    public void performCommonTasks() {
        // fill washing machine with water
    }
}
