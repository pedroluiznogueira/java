package generics.multipleparameters;

import java.util.HashMap;
import java.util.Map;

public class MultipleParameters {

    public static void main(String[] args) {

        // multiple parameters
        GenericClass<String, Integer> genericClass = new GenericClass<>("something", 10);
        genericClass.getAttributeOne();
        genericClass.getAttributeTwo();
        genericClass.setAttributeOne("another something");
        genericClass.setAttributeTwo(20);
        System.out.println(genericClass.getAttributeOne());
        System.out.println(genericClass.getAttributeTwo());

    }
}

class GenericClass<D, W> {

    private D attributeOne;
    private W attributeTwo;

    public GenericClass(D attributeOne, W attributeTwo) {
        this.attributeOne = attributeOne;
        this.attributeTwo = attributeTwo;
    }

    public D getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(D attributeOne) {
        this.attributeOne = attributeOne;
    }

    public W getAttributeTwo() {
        return attributeTwo;
    }

    public void setAttributeTwo(W attributeTwo) {
        this.attributeTwo = attributeTwo;
    }
}
