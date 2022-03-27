package designprinciples.solid.dependencyinversion.abstraction;

import java.util.List;

public interface CustomerRepository {
    List<String> findNames();
}
