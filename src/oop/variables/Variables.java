package oop.variables;

public class Variables {

    /*
     * instance variables
     * - class level
     * - belong to the class
     * - belong to the objects of the class
     * - initialised whenever we create an object
     * - different copies are created every time we create objects
     *
     * local variables
     * - method level
     * - belong to the method
     * - initialised whenever we call a method
     *
     * static variables
     * - class level
     * - belong to the class
     * - DON'T belong to the objects of the class
     * - initialised only once at the start of execution
     * before instance variables
     * - only one copy of the static variable is created
     * and shared for every object instanciated
     * - if any object operate on the static variable
     * the changes will affect the other objects aswell
     *
    */
    public static void main(String[] args) {

        Fan fanOne = new Fan(false);
        Fan fanTwo = new Fan(false);

        // instance variable: isOn
        Boolean localVaribaleIsOn = fanOne.isOn;

        // local variable: localVariable
        Integer localVariable = 0;

        // static varible: staticVariable
        Integer staticVariableFan = Fan.staticVariable;

        // only one static variable exists no matter how many objects you have
        fanOne.printStaticVariable();
        fanTwo.printStaticVariable();


    }
}

class Fan {
    public Boolean isOn;
    public static Integer staticVariable = 0;

    public Fan(Boolean isOn) {
        this.isOn = isOn;
    }

    public void checkFanStatus() {
        if (isOn) System.out.println("Fan is On");
        else System.out.println("Fan is Off");
    }

    public void turnOn() {
        isOn = !isOn;
    }

    public void turnOff() {
        isOn = !isOn;
    }

    public void printStaticVariable() {
        staticVariable++;
        System.out.println(staticVariable);
    }
}

