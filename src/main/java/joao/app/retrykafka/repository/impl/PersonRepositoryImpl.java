package joao.app.retrykafka.repository.impl;

import joao.app.retrykafka.model.Person;
import joao.app.retrykafka.repository.PersonRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private List<Person> persons;

    public PersonRepositoryImpl() {
        this.persons = new ArrayList<>();
    }

    @Override
    public Person save(Person person) {
        person.setId((long) persons.size() + 1);
        persons.add(person);
        return person;
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }

    @Override
    public Optional<Person> findById(String id) {
        return persons.stream()
            .filter(person -> person.getId().toString().equals(id))
            .findFirst();
    }

}
