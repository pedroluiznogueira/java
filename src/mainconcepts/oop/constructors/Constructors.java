package mainconcepts.oop.constructors;

public class Constructors {
    public int x;

    public Constructors() {
        this.x = 20;
    }

    public Constructors(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Constructors object = new Constructors();
        System.out.println(object.x);

        Constructors anotherObject = new Constructors(50);
        System.out.println(anotherObject.x);
    }
}
