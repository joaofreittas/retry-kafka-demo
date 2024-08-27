package joao.app.retrykafka.service.person;

import joao.app.retrykafka.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);
    List<Person> findAll();
    Optional<Person> findById(String id);

}
