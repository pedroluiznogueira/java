package lambdas.usecases;

public class UseCases {

    public static void main(String[] args) {

        // no parameter and no return type
        UseCaseOne caseOneImpl = () -> System.out.println("use case one");
        caseOneImpl.functionalMethod();

        // one parameter and no return type
        UseCaseTwo caseTwoImpl = (parameter) -> System.out.println("use case two " + parameter);
        Integer firstParameterCaseTwo = 1;
        caseTwoImpl.functionalMethod(firstParameterCaseTwo);

        // more than one parameter and no return type
        UseCaseThree caseThreeImpl = (firstParameter, secondParameter) -> System.out.println("use case three " + firstParameter + secondParameter);
        Integer firstParameterCaseThree = 2;
        Integer secondParameterCaseThree = 3;
        caseThreeImpl.functionalMethod(firstParameterCaseThree, secondParameterCaseThree);

        // no parameter and return type
        UseCaseFour caseFourImpl = () -> "use case four";
        String caseFourReturn = caseFourImpl.functionalMethod();
        System.out.println(caseFourReturn);

        // one parameter and return type
        UseCaseFive caseFiveImpl = (firstParameter) -> firstParameter * 10;
        Integer firstParameterCaseFive = 4;
        Integer caseFiveReturn = caseFiveImpl.functionalMethod(firstParameterCaseFive);
        System.out.println("use case five " + caseFiveReturn);

        // more than one parameter and return type
        UseCaseSix caseSixImpl = (firstPameter, secondParameter) -> firstPameter * secondParameter;
        Integer firstParameterCaseSix = 5;
        Integer secondParameterCaseSix = 6;
        Integer caseSixReturn = caseSixImpl.functionalMethod(firstParameterCaseSix, secondParameterCaseSix);
        System.out.println("use case six " + caseSixReturn);

        // no parameter, no return type and multiple statements
        UseCaseSeven caseSevenImpl = () -> {
            System.out.println("use case seven");
            System.out.println("second statement");
            System.out.println("third statement");
            System.out.println("fourth statement");
        };
        caseSevenImpl.functionalMethod();
        System.out.println(caseSevenImpl);
    }
}

interface UseCaseOne {
    public abstract void functionalMethod();
}

interface UseCaseTwo {
    public abstract void functionalMethod(Integer firstParameter);
}

interface UseCaseThree {
    public abstract void functionalMethod(Integer firstParameter, Integer secondParamter);
}

interface UseCaseFour {
    public abstract String functionalMethod();
}

interface UseCaseFive {
    public abstract Integer functionalMethod(Integer firstParameter);
}

interface UseCaseSix {
    public abstract Integer functionalMethod(Integer firstParameter, Integer secondParameter);
}

interface UseCaseSeven {
    public abstract void functionalMethod();
}
