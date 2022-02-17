package designprinciples.solid.dependencyinversion.highlevel;

import designprinciples.solid.dependencyinversion.abstraction.CustomerDao;
import designprinciples.solid.dependencyinversion.lowlevel.CustomerDaoImpl;

public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


}
