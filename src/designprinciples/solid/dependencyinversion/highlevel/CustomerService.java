package designprinciples.solid.dependencyinversion.highlevel;

import designprinciples.solid.dependencyinversion.abstraction.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerDao;

    public CustomerService(CustomerRepository customerDao) {
        this.customerDao = customerDao;
    }

}
