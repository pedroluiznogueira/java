package designprinciples.solid.dependencyinversion.abstraction;

import java.util.List;

public interface CustomerDao {
    List<String> findNames();
}
