package oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Abstraction {

    /*
     * Abstraction != Data Hiding
     * abstraction -> hide the internal implementation of something (interfaces and abstract classes)
     * data hiding -> hide data, usgin validation for example (private)
     *
     * Abstract Classes
     * 1. we can extend only one abstract class
     * 2. can have abstract methods, static, and private methods
     * 3. abstract keyword required in the declaration of abstract methods
     * 4. can have static, final os static final variables with any access modifier
     *
     * Interfaces
     * 1. we can implement any number of interfaces
     * 2. can have abstract methods, static, default and private methods
     * 3. abstract keywork not required. as by default all methods are abstract
     * 4. can have only public static final variable by default
     *
    */
    public static void main(String[] args) {

        // abstraction with interface
        Apple phoneOne = new Apple();
        phoneOne.calling("1111111");
        phoneOne.sendMessage("some message");
        phoneOne.addContacts("2222222");

        // abstraction with abstract class
        Samsung phoneTwo = new Samsung();
        phoneTwo.addContacts("3333333");
    }
}

interface IMobile {

    public abstract void calling(String number);

    public abstract void sendMessage(String message);
}

abstract class AMobile {
    private List<String> contacts = new ArrayList<>();

    public abstract void calling(String number);

    public abstract void sendMessage(String message);

    protected void addContacts(String number) {
        contacts.add(number);
    }
}

class Apple implements IMobile {

    private List<String> contacts = new ArrayList<>();

    @Override
    public void calling(String number) {
        System.out.println("calling... " + number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("sending message... " + message);
    }

    public void addContacts(String number) {
        contacts.add(number);
    }
}

class Samsung extends AMobile {

    @Override
    public void calling(String number) {
        System.out.println("calling... " + number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("sending message... " + message);
    }

    @Override
    protected void addContacts(String number) {
        super.addContacts(number);
    }
}
