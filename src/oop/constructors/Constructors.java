package oop.constructors;

public class Constructors {

    /*
     * constructors are called when
     * objects are created
     *
     * parameterized constructors are used to initilize
     * values of attributes at run time
     *
    */
    public static void main(String[] args) {

        // first constructor
        FirstClass objectOne = new FirstClass();

        // second constructor
        FirstClass objectTwo = new FirstClass("something");
    }
}

class FirstClass {

    private String attributeOne;

    public FirstClass() {
    }

    public FirstClass(String attributeOne) {
        this.attributeOne = attributeOne;
    }
}
