package oop.encapsulation;

public class Encapsulation {

    /*
     * is a group up of data members, member functions
     * in a single unit
     *
     * a class is a example of encapsulation, allows a class
     * to change it's internal implementation without hiding
     * the overral functionality of the system
     *
     * data hiding + abstraction = encapsulation
     *
     * advantages
     * - maintainabilty, hiding data and abstraction
     *
     * a class wich each and every attribute is private, is called
     * a tightly encapsulated class
     *
    */
    public static void main(String[] args) {

        // arrange
        Account account = new Account(1000D);

        // getter
        Double accountBalance = account.getBalance();

        // setter
        account.setBalance(2000D);
        Double accountBalanceUpdated = account.getBalance();
    }
}

class Account {
    private Double balance;

    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
