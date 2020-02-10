package entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Diagnosis {
    private Long id;
    private final LocalDateTime dateTime;
    private final Doctor doctor;
    private final Client client;
    private final String diagnosis;
    private final String medication;
}
