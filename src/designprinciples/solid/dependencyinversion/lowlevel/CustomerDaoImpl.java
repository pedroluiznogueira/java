package designprinciples.solid.dependencyinversion.lowlevel;

import designprinciples.solid.dependencyinversion.abstraction.CustomerDao;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<String> findNames() {
        return List.of("pedro", "luiz");
    }
}
