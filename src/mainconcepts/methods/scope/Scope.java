package mainconcepts.methods.scope;

public class Scope {

    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);

        // Code here CANNOT use j

        { // This is a block

            // Code here CANNOT use j

            int j = 100;

            // Code here CAN use j
            System.out.println(j);

        } // The block ends here

        // Code here CANNOT use j
    }
}
