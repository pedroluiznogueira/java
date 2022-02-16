package oop.classes;

public class Classes {

    /*
     * classes are blueprints
     * a design from wich to create objects
     *
     * <Modifier> class <Classname> {
     *
     * // attributes - features
     *
     * // methods - behavior
     *
     * }
     *
    */
    public static void main(String[] args) {

        Fan fan = new Fan(false);
        fan.turnOn();
        fan.checkFanStatus();
        fan.turnOff();
        fan.checkFanStatus();

    }
}

class Fan {
    private Boolean isOn;

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
}
