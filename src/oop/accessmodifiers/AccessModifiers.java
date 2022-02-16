package oop.accessmodifiers;

public class AccessModifiers {

    /*
     * public, private, protected, default(no modifier)
     *
     * public
     * - accessed everywhere
     *
     * private
     * - accessed only in the class context
     *
     * protected
     * - accessed only in the class and it's subclasses
     * - can't access protected methods inside subclasses
     * if the object you are using was created with the
     * reference of the parent class
     *
     *
    */
    public static void main(String[] args) {

    }
}

class FirstClass {

    public void methodOne() {}

    private void methodTwo() {}

    protected void methodThree() {}

}

class SecondClass extends FirstClass {

    public static void main(String[] args) {

        // arrange
        FirstClass firstClass = new FirstClass();

        // public method
        firstClass.methodOne();

        // private method can't be accessed
        // firstClass.methodTwo();

        // protected method
        SecondClass secondClass = new SecondClass();
        secondClass.methodThree();
    }
}
