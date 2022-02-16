package oop.polymorphism.overloading;

public class Overloading {

    /*
     * Overloading
     *
     * - method signature: <methodName>(<ArgumentType> argument)
     * - ability of having more than one method
     * with the same name in a class but with different
     * method signatures
     * - non formally, the same method with different
     * arguments, different meaning, different only in type
     * or in number
     *
     * - types can be promoted here
     *
     * byte -> short -> int -> long -> float -> double
     *                   ^
     *                   |
     *                  char
     *
     * - the return type isn't included on the overloading, since
     * - they are not included in the method signature
     *
    */
    public static void main(String[] args) {

    }
}

class Addition {

    public void sum(Integer first, Integer second) {
        System.out.println(first + second);
    }

    public void sum(Double first, Double second) {
        System.out.println(first + second);
    }

    public void sum(Integer first, Integer second, Integer third) {
        System.out.println(first + second + third);
    }

    public void sum(Double first, Double second, Double third) {
        System.out.println(first + second + third);
    }
}
