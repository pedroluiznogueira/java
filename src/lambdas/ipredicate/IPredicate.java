package lambdas.ipredicate;

import java.util.function.Predicate;

public class IPredicate implements Predicate {

    /*
     * it is a pre defined interfaces
     * using it we write less code
     * there's no need for creating
     * the functional interface manually
     *
     * remember that to be a funcional interface
     * the interface must have a single abstract method
     *
     * it's abstract method test() returns boolean
     *
    */
    public static void main(String[] args) {

        /*
         * business logic: validate salary
         * if salary >= 4000 it is valid
         * othewise it is invalid
         *
        */

        // without lambdas and IPredicate
        Integer salaryWithoutLambda = 3000;
        Boolean isSalaryValidWithoutLambda = validateSalary(salaryWithoutLambda);
        System.out.println(isSalaryValidWithoutLambda);

        // with lambdas and IPredicate

        Integer salaryWithLambda = 5000;

        // explicit return statement
        Predicate<Integer> firstPredicate = (salary) -> {
          if (salary >= 4000) return true;
          return false;
        };

        // implicit return statement
        Predicate<Integer> secondPredicate = (salary) -> salary >= 4000;

        Boolean isSalaryValidWithLambda = firstPredicate.test(salaryWithLambda);
        isSalaryValidWithLambda = secondPredicate.test(salaryWithLambda);

    }

    // single abstract method
    @Override
    public boolean test(Object o) {
        return false;
    }

    public static Boolean validateSalary(Integer salary) {
        if (salary >= 4000) return true;
        return false;
    }
}
