package designprinciples.delegation;

public class Delegation {

    /*
     * - delegation principle
     * - tasks are delegated to the components who are
     * specialized to do so
     *
     * - if you have an interface and two classes are
     * implementing it
     * - so the logic is the same in both classes but
     * they are separate classes
     * - so each class implement the doSameTask()
     * with the same logic
     *
     * business rule
     * - you have a class Account wich has an attribute balance
     * - this class needs to have a method that converts the
     * balance from a currency to another
     * - for each different currency we will have to create a new
     * method, and as the amount of currencies grows we will end up
     * coupling our Account class, wich shouldn't be fullfilled of
     * converter methods
     * - we solve by
     * - 1. create an interface Converter wich has a convert method
     * to be implemented
     * - 2. we change all the convert() methods in the Account class
     * to one convert() method that will recieve a Converter as parameter
     * wich will be responsible to actually convert the balance, this way
     * we are delegating the convert functionality that the Account class
     * needs, to another class that implements the Converter interface
     * - so the "other" class can be of any currency you want to convert to
     *
    */
    public static void main(String[] args) {

        Account account = new Account(2000D);

        Double dolar = account.convert(new DolarConverter());
        Double euro = account.convert(new EuroConverter());

        System.out.println(dolar);
        System.out.println(euro);
    }
}

interface Converter {
    Double convert(Double balance);
}

class Account {
    public Double balance;

    public Account(Double balance) {
        this.balance = balance;
    }

    // with delegation
    public Double convert(Converter converter) {
        return converter.convert(balance);
    }

    // without delegation

    public Double convertDolar() {
        return balance * 3.66;
    }

    public Double convertEuro() {
        return balance * 4.21;
    }

}

class DolarConverter implements Converter {

    @Override
    public Double convert(Double balance) {
        return balance * 3.66;
    }
}

class EuroConverter implements Converter {

    @Override
    public Double convert(Double balance) {
        return balance * 4.21;
    }
}