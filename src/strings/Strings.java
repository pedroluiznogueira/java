package strings;

public class Strings {

    public static void main(String[] args) {

        String greeting = "Hello";

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String text = "Hello World";
        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"

        String phrase = "Please locate where 'locate' occurs!";
        System.out.println(phrase.indexOf("locate")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String name = "John ";
        String secondName = "Doe";
        System.out.println(name.concat(secondName));



    }
}
