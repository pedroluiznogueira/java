package generics.methods;

public class Methods {

    /*
     * if we don't want to specify the type
     * of a specific parameter in a method
     * we pass the parameter type as T
     * and before the return type of the method
     * we pass <T> even though we are not in a
     * GenericClass
     *
     * it works in the same way for constructors
     * since deeply they are methods
     *
    */
    public static void main(String[] args) {

        NonGenericClass.methodWithSpecificType("gvgf");
        NonGenericClass.methodWithoutSpecificType(1);

    }
}

class NonGenericClass {

    public static String methodWithSpecificType(String data) {
        return "data is: " + data;
    }

    public static <T> String methodWithoutSpecificType(T data) {
        return "data is: " + data;
    }
}
