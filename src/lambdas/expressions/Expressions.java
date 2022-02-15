package lambdas.expressions;

public class Expressions {

    /*
     * lambdas are nothing more than anonymous functions
     * functions without name, modifier and return type
     *
     * formats
     *
     * () -> someMethod("doSomething");
     * (firstParameter, secondParameter) -> someMethod(firstParameter + secondParameter);
     * firstParameter -> methodThatReturnSomething();
     * () -> { multiple statements };
     *
    */
    public static void main(String[] args) {

    }

    // First Type

    // traditional method declaration
    public static void printName() {
        System.out.println("name");
    }

    // lambdas have no name
    // public static void () {
    // }

    // lambdas have no modifier
    // void () {
    // }

    // lambdas have no return type
    // () {
    // }

    // () -> {
    // System.out.println("pedro");
    // }

    // () -> System.out.println("pedro");

    // Second Type

    public static void add(Integer firstNumber, Integer secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    // parameters types can be removed because compiler uses type inference
    // (firstNumber, secondNumber) -> System.out.println(firstNumber + secondNumber);

    // Third Type

    public static int length(String stringToCheckLength) {
        return stringToCheckLength.length();
    }

    // no need to use the "return" key word, because compiler can guess it aswell
    // (stringToCheckLength) -> stringToCheckLength.length();

}
