package designprinciples.slap;

public class Slap {

    /*
     * - single level of abstraction
     * - about writing methods or functions
     * - a reusible unity must not be lengthy
     * because they are hard to test, read
     * - for example, a method
     * isValid() should only perfom the validation
     * it shouldn't perform SQL queries for
     * - a method should have only one reason to change
     *
    */
    public static void main(String[] args) {

    }

    // two levels of abstraction -> 1. to get details and 2. to send an email
    public void getDetails() {
        // code to fetch details from database
        System.out.println("fetching details from database");

        // responsability handled to sendEmail() method
        sendEmail("emailContent");
    }

    private void sendEmail(String emailContent) {
        // code to email the user
        System.out.println("mailing to the user");
    }
}
