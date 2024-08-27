package joao.app.retrykafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {

    private Long id;
    private String name;

    public void changeName(final String name) {
        this.name = name;
    }

    public void setId(final Long id) {
        this.id = id;
    }

}
