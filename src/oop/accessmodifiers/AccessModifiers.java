package oop.accessmodifiers;

public class AccessModifiers {
    public String attributeOne;
    private String attributeTwo;

    public AccessModifiers() {
        this.attributeOne = "attribute one";
        this.attributeTwo = "attribute two";
    }

    public String getAttributeTwo() {
        return attributeTwo;
    }
}

class Main {

    public static void main(String[] args) {
        AccessModifiers object = new AccessModifiers();

        // public can be accessed outside the class
        System.out.println(object.attributeOne);

        // private can't be accessed outside the class
        System.out.println(object.getAttributeTwo());
    }
}
