package entity;

import lombok.Data;

@Data
public class Doctor {
    private Long id;
    private final String name;
    private final String surname;
    private final String specialization;

}
