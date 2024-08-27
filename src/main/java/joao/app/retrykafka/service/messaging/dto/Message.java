package joao.app.retrykafka.service.messaging.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message implements MessageDTO {

    private String binder;
    private String event;
    private PayloadMessage payload;

    @Override
    @JsonIgnore
    public String getBinder() {
        return binder;
    }

    @Override
    @JsonIgnore
    public String getEventName() {
        return event;
    }

    @Override
    public PayloadMessage getPayload() {
        return payload;
    }

}
