package mainconcepts.importantclasses.wrappers;

public class Wrappers {

    public static void main(String[] args) {

        String myString = "something";
        Integer myInt = 100;
        Double myDouble = 5.99;
        Character myChar = 'A';

        // mainconcepts.methods
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(myString);

        // converting
        String myIntAsString = myInt.toString();
        System.out.println(myIntAsString.length());
    }
}
