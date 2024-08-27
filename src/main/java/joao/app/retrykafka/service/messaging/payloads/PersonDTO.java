package joao.app.retrykafka.service.messaging.payloads;

import joao.app.retrykafka.service.messaging.dto.PayloadMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonDTO implements PayloadMessage {

    public static final String EVENT_NAME = "PERSON_CREATED";
    public static final String BINDER_NAME = "kafkaRetryEvents-out-0";

    private Long id;
    private String name;

}
