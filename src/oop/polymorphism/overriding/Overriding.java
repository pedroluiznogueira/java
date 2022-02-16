package oop.polymorphism.overriding;

public class Overriding {

    /*
     * Overriding
     *
     * - allows the childs class to provide it's own
     * implementation of a method of the parent class
     * - so the same method declared in the parent class
     * can have different implementation in the child classes
     * - different implementation = different behavior
     *
     * JVM on Overriding
     *
     * - if the method is overrided, jvm goes for the overrided
     * method, instead it goes for the method in the parent class
     *
     * - we can't decrease the visibility of an
     * overrided method
     * - we can increase the visibility of an
     * overrided method
     * - we can't override the final methods since they are final
     * so they won't be overriden
     * - we can't override the static methods since they are static
     * so they will only be used from a static context
     * - we can't override private methods since they are only accessed
     * in the scope of the class
     *
     * - with super() we are referring to the parent class implementation
     *
    */
    public static void main(String[] args) {

         // 1. Goes for the parent method
         ParentClass objOne = new ParentClass();
        objOne.methodToOverride();

         // 2. Goes for the overrided method
         ChildClass objTwo = new ChildClass();
        objTwo.methodToOverride();

         // 3. Goes for the overrided method
         ParentClass objThree = new ChildClass();
        objThree.methodToOverride();
    }
}

class ParentClass {

    public void methodToOverride() {
        System.out.println("override it");
    }
}

class ChildClass extends ParentClass {

    @Override
    public void methodToOverride() {
        System.out.println("this is overrided");
    }
}