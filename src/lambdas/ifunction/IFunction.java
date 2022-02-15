package lambdas.ifunction;

import java.util.function.Function;

public class IFunction implements Function {

    /*
     * it is a pre defined interfaces
     * using it we write less code
     * there's no need for creating
     * the functional interface manually
     *
     * remember that to be a funcional interface
     * the interface must have a single abstract method
     *
     * it's abstract method apply() returns anything
     * Function<T, R>
     * T - type of the parameter of the abstract method
     * R - return type of the abstrac method
     * it is up to you on your implementation to define it
     *
    */
    public static void main(String[] args) {

        // lambdas and IFunction
        Function<String, Integer> function = (string) -> string.length();
        Integer stringLength = function.apply("pedro luiz");
        System.out.println(stringLength);
    }

    // the abstract method
    @Override
    public Object apply(Object o) {
        return null;
    }
}
