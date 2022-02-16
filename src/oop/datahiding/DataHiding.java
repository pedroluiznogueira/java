package oop.datahiding;

public class DataHiding {

    /*
     * Data Hiding != Abstraction
     * abstraction -> hide the internal implementation of something (interfaces and abstract classes)
     * data hiding -> hide data, usgin validation for example (private)
     *
     * technique to hide internal object details
     * data member or components
     *
     * validation proccess is a way of hiding data
     *
     *
    */
    public static void main(String[] args) {

    }
}

class BankAccount {
    private Double balance = 10000D;
    private String username = "pedro";
    private String password = "password";

    public Double getWalletBalance(String username, String password) {
        if (validateCredentials(username, password)) return balance;
        return 0.0;
    }

    private final Boolean validateCredentials(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) return true;
        return false;
    }
}

class AccessAccount {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Double balance = bankAccount.getWalletBalance("pedro", "password");
        System.out.println(balance);

    }
}
