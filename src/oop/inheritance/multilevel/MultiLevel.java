package oop.inheritance.multilevel;

public class MultiLevel {

    /*
     * a class can't extend more than one class
     * because we can run into ambiguity problems
     * if the two innherited classes have methods
     * with the same name
     *
     * we can implement more than one interface
     * because when we override a method that is
     * in both interfaces it will only have one
     * method implementation, since the methods
     * are abstract
     *
     * but if the ambiguous methods are default
     * methods from interfaces, we may run into
     * a problem, wich can be solved explicit
     * saying wich of the methods to be called
     *
    */
    public static void main(String[] args) {

    }
}

class ParentClass {}

class ChildClass extends ParentClass {}

class SubChildClass extends ChildClass {}
