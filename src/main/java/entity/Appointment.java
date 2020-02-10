package entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Appointment {
    private Long id;
    private final Client client;
    private final Doctor doctor;
    private final LocalDateTime dateTime;
    private final String room;
}
