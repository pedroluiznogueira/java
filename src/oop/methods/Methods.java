package oop.methods;

public class Methods {

    public int number = 10;

    public static void main(String[] args) {
        Methods object = new Methods();
        int result = object.addToNumber(10);
    }

    public int addToNumber(int anotherNumber) {
        return number + anotherNumber;
    }

}
