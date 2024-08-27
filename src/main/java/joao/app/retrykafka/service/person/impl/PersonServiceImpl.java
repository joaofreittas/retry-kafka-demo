package joao.app.retrykafka.service.person.impl;

import joao.app.retrykafka.model.Person;
import joao.app.retrykafka.repository.PersonRepository;
import joao.app.retrykafka.service.messaging.BrokerService;
import joao.app.retrykafka.service.messaging.dto.Message;
import joao.app.retrykafka.service.messaging.payloads.PersonDTO;
import joao.app.retrykafka.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final BrokerService brokerService;

    @Override
    public Person save(final Person person) {
        var personSaved = personRepository.save(person);

        publishEvent(personSaved);
        return personSaved;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(final String id) {
        return personRepository.findById(id);
    }

    private void publishEvent(final Person personSaved) {
        var payload = new PersonDTO(personSaved.getId(), personSaved.getName());
        var message = new Message(PersonDTO.BINDER_NAME, PersonDTO.EVENT_NAME, payload);

        brokerService.publishMessage(message);
    }

}
