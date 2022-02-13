package collections.arrays.types;

public class Types {

    public static void main(String[] args) {

        // storing any type that can get promoted to the declared type
        int[] firstArray = new int[3];
        byte myByte = 2;
        short myShort = 4;
        firstArray[0] = myByte;
        firstArray[1] = myShort;

        // storing types of subclasses
        Object[] objectArray = new Object[1];
        objectArray[0] = new String("something");

        // storing child of abstract classes
        Number[] numberArray = new Number[2];
        numberArray[0] = new Integer(1);
        numberArray[1] = new Byte("2");

        // storing objects of the classes that implement an interface
        Runnable[] interfaceArray = new Runnable[2];
        interfaceArray[0] =  new Thread();
    }
}
