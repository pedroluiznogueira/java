package mainconcepts.oop.encapsulation;

public class Encapsulation {
    private String attributeOne;

    public Encapsulation(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(String attributeOne) {
        this.attributeOne = attributeOne;
    }

}

class Main {

    public static void main(String[] args) {
        Encapsulation object = new Encapsulation("attribute one");
        System.out.println(object.getAttributeOne());

        object.setAttributeOne("attribute one changed");
        System.out.println(object.getAttributeOne());
    }
}
