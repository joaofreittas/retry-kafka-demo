package joao.app.retrykafka.service.messaging.dto;

public interface MessageDTO {

    String getBinder();
    String getEventName();
    PayloadMessage getPayload();

}
