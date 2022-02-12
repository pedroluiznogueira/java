package mainconcepts.oop.objects;

public class Objects {
    public String someAttribute;

    public Objects(String someAttribute) {
        this.someAttribute = someAttribute;
    }

    public static void main(String[] args) {
        Objects object = new Objects("some message");
        System.out.println(object.someAttribute);
    }

}
