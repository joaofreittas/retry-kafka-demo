package joao.app.retrykafka.service.messaging.impl;

import joao.app.retrykafka.service.messaging.BrokerService;
import joao.app.retrykafka.service.messaging.dto.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BrokerServiceImpl implements BrokerService {

    private final StreamBridge streamBridge;

    @Override
    public void publishMessage(final MessageDTO messageDTO) {
        System.out.println("publishing message...");

        streamBridge.send(messageDTO.getBinder(), messageDTO);
    }

}
