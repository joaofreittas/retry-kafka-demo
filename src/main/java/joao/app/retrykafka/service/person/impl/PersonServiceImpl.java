package joao.app.retrykafka.service.person.impl;

import joao.app.retrykafka.model.Person;
import joao.app.retrykafka.repository.PersonRepository;
import joao.app.retrykafka.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person save(final Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(final String id) {
        return personRepository.findById(id);
    }

}
