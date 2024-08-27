package joao.app.retrykafka.service.messaging;

import joao.app.retrykafka.service.messaging.dto.MessageDTO;

public interface BrokerService {

    void publishMessage(MessageDTO messageDTO);

}
