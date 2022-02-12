package importantclasses.exceptions;

public class Exceptions {

    // use try to define a block of code to be tested
    // if an error occurs, the block of code in the catch will be used
    // the finally statement lets you execute code, after try...catch, regardless of the result
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        checkAge(15); // Set age to 15 (which is below 18...)

    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
