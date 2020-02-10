package entity;

import lombok.Data;

@Data
public class Client {
    private Long id;
    private final String name;
    private final String surname;
    private final String phoneNumber;
}
