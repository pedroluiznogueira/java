package designprinciples.solid.dependencyinversion.lowlevel;

import designprinciples.solid.dependencyinversion.abstraction.CustomerRepository;

import java.util.List;

public class PostgreSqlImpl implements CustomerRepository {

    @Override
    public List<String> findNames() {
        return List.of("pedro", "luiz");
    }
}
