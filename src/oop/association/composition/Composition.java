package oop.association.composition;

public class Composition {

    /*
     * Composition
     *
     * - an Association is said to be Composition
     * if both the entities that are associated can't
     * exist independently
     * examples:
     * - House has a Kitchen
     * - why ?
     * - a Kitchen can't exist without the House
     *
    */
    public static void main(String[] args) {

        // house points to it's memory address, once it does not exist anymore kitchen will no longer exist aswell
        House house = new House();

    }
}

class House {
    private Kitchen kitchen;

    public House() {
        this.kitchen = new Kitchen();
        kitchen.setFood("pizza");
    }

    public String getFood() {
        return kitchen.getFood();
    }

    @Override
    public String toString() {
        return "House{" +
                "kitchen=" + kitchen +
                '}';
    }
}

class Kitchen {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}