package joao.app.retrykafka.repository;

import joao.app.retrykafka.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {

    Person save(Person person);
    List<Person> findAll();
    Optional<Person> findById(String id);

}
