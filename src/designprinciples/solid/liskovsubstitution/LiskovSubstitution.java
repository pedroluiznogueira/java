package designprinciples.solid.liskovsubstitution;

public class LiskovSubstitution {

    /**
     * <p>- liskov substitution states substitutability
     * of a class by it's subclass, so a class can be
     * replaced by it's subclass in all practical usage
     * scenarios
     * <p>- inheritance should be used only for substitutability
     * <p>- if we have a ChildClass that extends a ParentClass
     * we should only use inheritance if a ParentClass object
     * can be used as a ChildClass object
     * <p>- otherwise we should use Composition or Delegation
     *
     * <p>business rule
     * <p>- if we have a parent class BirdClass and a subclass
     * Sparrow, if the parent class has a fly() method, the
     * Sparrow class will have it aswell for extending it
     * <p>- but if a Ostrich class also extends BirdClass it
     * violates the LSP because an Ostrich can't fly, but
     * it will extend the fly method, even though it is also
     * a bird
     *
     * <p>- a way of solving it would be to instead of having
     * the fly() method that may violate the LSP when used
     * from sub classes that don't actually fly, we could take
     * this fly() method to another class that extends Bird that
     * would be FlyingBird so only the birds wich extend it would
     * have the fly() method and the birds that don't fly would
     * extend directly Bird
     * <p>
    */
    public static void main(String[] args) {

        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();

        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}

class Bird {

    public void greet() {
        System.out.println("hi from bird...");
    }
}

class FlyingBird {
    public void fly() {
        System.out.println("flying...");
    }
}

class Sparrow extends FlyingBird {
}

class Ostrich extends Bird {

}
