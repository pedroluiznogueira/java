package importantclasses.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdas {

    // have to immediately return a value
    // can't contain variables
    // can't contain statements
    // can't contain assigments
    // for complex operations use curly braces
    public static void main(String[] args) {

        // (parameter1, parameter2) -> expression
        // (parameter1, parameter2) -> { code block }

        // arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);

        // parameter -> expression
        numbers.forEach(number -> System.out.println(number));

        // parameter -> { code block }
        numbers.forEach(number -> { System.out.println(number); });

        // (parameter) -> expression
        numbers.forEach((number) -> System.out.println(number));

        // (parameter) -> { code block }
        numbers.forEach((number) -> { System.out.println(number); });

        // storing a lambda expression in a variable
        Consumer<Integer> lambdaExpression = (number) -> { System.out.println(number); };
        numbers.forEach(lambdaExpression);

    }
}
