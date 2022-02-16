package oop.inheritance.multiple;

public class Multiple {

    /*
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
     * so we specify when overriding the method]
     * using IterfaceName.super().methodName();
     *
    */
    public static void main(String[] args) {

        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.defaultMethod();
    }
}

interface FirstInterface {

    default void defaultMethod() {
        System.out.println("default from the first interface");
    }
}

interface SecondInterface {

    default void defaultMethod() {
        System.out.println("default from the second interface");
    }
}

class InterfaceImpl implements FirstInterface, SecondInterface {

    @Override
    public void defaultMethod() {
        FirstInterface.super.defaultMethod();
    }
}
