package oop.methods;

public class Methods {

    /*
     *
     * <Modifier> <return type> <Method name> (<paramter(s)>) {
     *      <method body>
     * }
     *
    */
    public static void main(String[] args) {

        // instance method
        FirstClass firstClass = new FirstClass();
        firstClass.method();

        // non stance method
        FirstClass.staticMethod();

    }
}

class FirstClass {

    // instance methods
    public void method() {}
    public void methodWithParameter(Integer first) {}
    public void methodWithParameters(Integer first, Integer second) {}

    // non stance methods
    public static void staticMethod() {}
}
