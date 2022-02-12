package methods.overloading;

public class Overloading {

    public static int plusMethodInt(int x, int y) {
        return x + y;
    }

    public static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static int plusMethod(int x, int y) {
        return x + y;
    }

    public static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        // without overloading
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);

        // with overloading
        int myNum3 = plusMethod(8, 5);
        double myNum4 = plusMethod(4.3, 6.26);
    }
}
