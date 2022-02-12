package mainconcepts.oop.inheritance;

public class Inheritance {
    private String attributeOne;
    protected String attributeProtected; // subclasses can access it

    public Inheritance() {
        this.attributeOne = "attribute one";
        this.attributeProtected = "attribute protected";
    }

    public Inheritance(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public void printSomething() {
        System.out.println("something");
    }
}

class Subclass extends Inheritance {
    private String attributeTwo;

    public Subclass() {
    }

    public Subclass(String attributeOne) {
        super(attributeOne);
    }

    public String getAttributeTwo() {
        return attributeTwo;
    }

    public void setAttributeTwo(String attributeTwo) {
        this.attributeTwo = attributeTwo;
    }
}

class Main {

    public static void main(String[] args) {
        Subclass subclass = new Subclass();

        System.out.println(subclass.getAttributeOne());
        System.out.println(subclass.attributeProtected);
        subclass.printSomething();
    }
}
